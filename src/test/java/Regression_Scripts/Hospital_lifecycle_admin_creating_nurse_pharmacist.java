package Regression_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Admin_CreateNurse_Page;
import Pom_classes.Admin_CreatePharmacist_Page;
import Pom_classes.Admin_Dashboard_Page;
import Pom_classes.Login_Page;
import Pom_classes.Admin_Nurse_Page;
import Pom_classes.Admin_Pharmacist_Page;

public class Hospital_lifecycle_admin_creating_nurse_pharmacist extends Generic_Test
{
	@Test
	public void admin_creating_nurse_pharmacist()
	{
		Login_Page a=new Login_Page(driver);
		a.sendUn("admin@admin.com");
		a.sendPwd("admin@123");
		a.clickOnLogin();
		Admin_Dashboard_Page b=new Admin_Dashboard_Page(driver);
		b.clickOnNurse();
		Admin_Nurse_Page c=new Admin_Nurse_Page(driver);
		c.clickOnAddnurse();
		Admin_CreateNurse_Page d=new Admin_CreateNurse_Page(driver);
		d.sendUn("nurse");
		d.sendPwd("123");
		d.sendEmail("nurse@gmail.com");
		d.clickOnSubmit();
		c.clickOnSearch("nurse");
		b.clickOnPharmacist();
		
		Admin_Pharmacist_Page e=new Admin_Pharmacist_Page(driver);
		e.clickOnAddPharmacist();
		Admin_CreatePharmacist_Page f=new Admin_CreatePharmacist_Page(driver);
		f.sendUn("pharmacist");
		f.sendPwd("123");
		f.sendEmail("pharmacist@123");
		f.clickOnSubmit();
		e.clickOnSearch("pharmacist");
		b.clickOnLogout();
	}
}
