package com.nt.lib;

import org.openqa.selenium.WebDriver;

public class Global {
public static WebDriver driver;
	
	public static String url="http://183.82.103.245/nareshit/login.php";
	public static String userName="nareshit";
	public static String password="nareshit";
	public static String lastName="Vasu";
	public static String firatName="Kothem";
	public static String middleName="anju";
	public static String nickName="va";
	public static String photoPlace="D://Apache Software Foundation/servlet_Images/vasu_img.jpeg";
	public static String search_name="vasu";
	

	public static String txt_userName="txtUserName";
	public static String txt_password="txtPassword";
	public static String btn_login="Submit";
	public static String pim_module="PIM";
	public static String add_Emp="Add Employee";
	public static String txt_lastName="txtEmpLastName";
	public static String txt_firstName="txtEmpFirstName";
	public static String txt_middle="txtEmpMiddleName";
	public static String txt_nickName="txtEmpNickName";
	public static String txt_photeFile="//input[@type='file'][@id='photofile']";
	public static String btn_save="btnEdit";
	public static String frame_name="rightMenu";
	public static String btn_back="//input[@class='backbutton'][@onclick='goBack()']";
	public static String select_dropdown_id="loc_code";
	public static String search_box_name="loc_name";
	public static String btn_search_Emp="//input[@class='plainbtn'][@onclick='returnSearch();']";
	public static String select_checkbox="//input[@name='chkLocID[]'][@type='checkbox']";
	public static String delete_btn="//input[@type='button'][@value='Delete']";
	public static String logout="//*[@id=\"option-menu\"]/li[3]/a";
	
}
