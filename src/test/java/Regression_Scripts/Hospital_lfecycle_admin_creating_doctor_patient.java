package Regression_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Admin_CreateDoctor_Page;
import Pom_classes.Admin_CreatePatient_Page;
import Pom_classes.Admin_Dashboard_Page;
import Pom_classes.Admin_Doctor_Page;
import Pom_classes.Login_Page;
import Pom_classes.Admin_Patient_Page;

public class Hospital_lfecycle_admin_creating_doctor_patient extends Generic_Test
{
	@Test
	public void admin_creating_doctor_patient()
	{
		Login_Page a=new Login_Page(driver);
		a.sendUn("admin@admin.com");
		a.sendPwd("admin@123");
		a.clickOnLogin();
		a.waitUntilUrlContains();
		Admin_Dashboard_Page b=new Admin_Dashboard_Page(driver);
		b.clickOnDoctor();
		Admin_Doctor_Page c=new Admin_Doctor_Page(driver);
		c.clickOnAddDoctor();
		Admin_CreateDoctor_Page d=new Admin_CreateDoctor_Page(driver);
		d.sendUn("keerthi");
		d.sendEmail("keerthi@gmail.com");
		d.sendPassword("123");
		d.sendNumber("8974124512");
		d.sendAdress("aaa bbb ccc ddd");
		d.clickOnSubmit();
		c.clickOnSearch("keerthi");
		b.clickOnPatient();
		Admin_Patient_Page e=new Admin_Patient_Page(driver);
		e.clickOnAddPatient();
		Admin_CreatePatient_Page f=new Admin_CreatePatient_Page(driver);
		f.sendUN("tanush");
		f.sendEmail("tanush@gmail.com");
		f.sendPwd("123");
		f.sendAge("27");
		f.clickOnSubmit();
		e.clickOnSearch("tanush");
		e.isTanushpresent();
		b.clickOnLogout();
	}
}