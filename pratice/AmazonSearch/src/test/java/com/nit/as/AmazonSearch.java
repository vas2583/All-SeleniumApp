package com.nit.as;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonSearch {

	/*
	    public static void main(String[] args) throws Exception {
	 * FileInputStream fis=new FileInputStream("./amazonSearch.xlsx"); XSSFWorkbook
	 * workbook=new XSSFWorkbook(fis); XSSFSheet sheet=workbook.getSheet("sheet1");
	 * int lastRowNum=sheet.getLastRowNum();
	 * System.out.println("rowss::"+lastRowNum); int
	 * lastColNum=sheet.getRow(1).getLastCellNum(); System.out.println(lastColNum);
	 * //get Firat Row Data XSSFRow firstRow =sheet.getRow(0); XSSFCell
	 * cell=firstRow.getCell(1); String data=cell.getStringCellValue();
	 * System.out.println(data);
	 * 
	 * XSSFRow firstRow1 =sheet.getRow(1); XSSFCell cell1=firstRow1.getCell(1);
	 * String cs=cell1.toString(); System.out.println(cs); DataFormatter
	 * formatter=new DataFormatter(); String index=formatter.formatCellValue(cell1);
	 * int index1=Integer.parseInt(index); System.out.println(index1);
	 * 
	 * 
	 * 
	 * XSSFCell cell1=sheet.getRow(1).getCell(0);
	 * System.out.println(cell1.toString());
	 * 
	 * for(int i=1;i<=lastRowNum;i++) { XSSFRow r=sheet.getRow(i); for(int
	 * j=0;j<lastColNum;j++) { String cel=r.getCell(j).toString();
	 * System.out.print(cel+ " "); } System.out.println(); }
	 */

	@Test
	public void amazonSearch() throws Exception {

		FileInputStream fis = new FileInputStream("./amazonSearch.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
	//	ChromeOptions options = new ChromeOptions();
		//WebDriverManager.chromedriver().setup();
		//options.addArguments("--headless=new"); 
		//WebDriver driver = new ChromeDriver();
	DesiredCapabilities cap=new DesiredCapabilities();
	   cap.setPlatform(Platform.WIN10);
	   cap.setBrowserName("chrome");
	  // cap.setBrowserName("MicrosoftEdge");
	   WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		System.out.println("We are on the Amazon WebPage");

		int lastRowNum = sheet.getLastRowNum();
		 
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow r = sheet.getRow(i);
			// search Item String Format
			String item = r.getCell(0).toString();
			// set Qty IN IndexBased
			XSSFCell cell = r.getCell(1);
			DataFormatter formater = new DataFormatter();
			String indexValue = formater.formatCellValue(cell);
			int quanty = Integer.parseInt(indexValue);

			// search Box
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys(item);
			new Actions(driver).sendKeys(Keys.ENTER).perform();
			System.out.println("Entered the search item and clicked Enter");

			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement firstItem = driver.findElement(By.xpath("(//div[contains(@class ,'s-main-slot')]/div[contains(@data-component-type, 's-search-result')])[1]"));
			 wait.until(ExpectedConditions.elementToBeClickable(firstItem));
			firstItem.click();
			Set<String> id = driver.getWindowHandles();
			ArrayList<String> as = new ArrayList(id);
			driver.switchTo().window((String) as.get(1));
			System.out.println("switch to searchitem Window  "+item);
			// increase the quantity
			boolean bo=driver.findElement(By.xpath("//select[@id='quantity']")).isDisplayed();
			if(bo==true) {
			WebElement qty = driver.findElement(By.xpath("//select[@id='quantity']"));
			Select sc = new Select(qty);
			sc.selectByIndex(quanty);
			System.out.println("quanty is Selected");
			Thread.sleep(2000);
			}
			// add to CartItems
			WebElement addCartItem = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			//wait.until(ExpectedConditions.elementToBeClickable(addCartItem));
			addCartItem.click();
			System.out.println("item is stored in Cart");
			driver.close();
			driver.switchTo().window(as.get(0));
			driver.navigate().back();
		       }
		// select addButton
		WebElement addCartBtn = driver.findElement(By.xpath("//div[@id='nav-cart-count-container']"));
		addCartBtn.click();
		Thread.sleep(2000);

		// get SubTotal
		WebElement subTotalItems = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium sc-number-of-items')])[1]"));
		String str = subTotalItems.getText();
		String indRuppe = driver.findElement(By.xpath("(//span[@class='currencyINR'])[1]")).getAttribute("class");
		WebElement subTotalPrice = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']"));
		String stp1 = subTotalPrice.getText();
		// String[] stp=stp1.split(" ");
		// stp[1]
		String stp = stp1.trim();
		System.out.println(str + stp + "::" + indRuppe);
		
		driver.quit();

	}
}
