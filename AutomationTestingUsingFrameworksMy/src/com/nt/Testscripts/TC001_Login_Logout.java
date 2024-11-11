package com.nt.Testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001_Login_Logout {
	
	@Test
	public void TC001()throws Exception {
	General gen=new General();
	 gen.openApplication();
	  Thread.sleep(3000);
	 gen.LoginApp();
	 Thread.sleep(3000);
	
	 gen.LogoutApp();
	 Thread.sleep(3000);
	 gen.closeApp();
	} 

}
