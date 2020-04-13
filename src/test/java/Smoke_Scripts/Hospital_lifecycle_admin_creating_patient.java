package Smoke_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Admin_CreatePatient_Page;
import Pom_classes.Admin_Dashboard_Page;
import Pom_classes.Login_Page;
import Pom_classes.Admin_Patient_Page;

public class Hospital_lifecycle_admin_creating_patient extends Generic_Test
{
	@Test
	public void createPatient()
	{
		Login_Page a=new Login_Page(driver);
		a.sendUn("admin@admin.com");
		a.sendPwd("admin@123");
		a.clickOnLogin();
		Admin_Dashboard_Page b=new Admin_Dashboard_Page(driver);
		b.clickOnPatient();
		Admin_Patient_Page c=new Admin_Patient_Page(driver);
		c.clickOnAddPatient();
		Admin_CreatePatient_Page d=new Admin_CreatePatient_Page(driver);
		d.sendUN("yyy");
		d.sendEmail("yyy@gmail.com");
		d.sendPwd("123");
		d.selectSex();
		d.sendAge("21");
		d.selectBloodgroup();
		d.clickOnSubmit();
		c.clickOnAddPatient();
		c.clickOnSearch("yyy");
		c.isYYYpresent();
	}
}
	