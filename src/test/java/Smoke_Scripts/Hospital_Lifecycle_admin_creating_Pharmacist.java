package Smoke_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Admin_CreatePharmacist_Page;
import Pom_classes.Admin_Dashboard_Page;
import Pom_classes.Login_Page;
import Pom_classes.Admin_Pharmacist_Page;

public class Hospital_Lifecycle_admin_creating_Pharmacist extends Generic_Test
{
	@Test
	public void createPharmacist()
	{
		Login_Page a=new Login_Page(driver);
		a.sendUn("admin@admin.com");
		a.sendPwd("admin@123");
		a.clickOnLogin();
		Admin_Dashboard_Page b=new Admin_Dashboard_Page(driver);
		b.clickOnPharmacist();
		Admin_Pharmacist_Page c=new Admin_Pharmacist_Page(driver);
		c.clickOnAddPharmacist();
		Admin_CreatePharmacist_Page d=new Admin_CreatePharmacist_Page(driver);
		d.sendUn("aaa");
		d.sendEmail("aaa@gmail.com");
		d.sendPwd("123");
		d.clickOnSubmit();
		c.clickOnSearch("aaa");
		c.isAAApresent();
	}
}
