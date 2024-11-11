package com.nt.Testscripts;

import com.hrms.lib.General;

public class TCOO2_AddEmployee {

	public static void main(String[] args)throws Exception {
		General gen=new General();
		gen.openApplication();
		Thread.sleep(2000);
		gen.LoginApp();
		Thread.sleep(2000);
		gen.enetreEmpDetailsFrame();
		Thread.sleep(2000);
		gen.addEmployee();
		Thread.sleep(2000);
		gen.exitEmpDetailsFrame();
		Thread.sleep(2000);
		gen.LogoutApp();
		Thread.sleep(2000);
		gen.closeApp();
	}

}
