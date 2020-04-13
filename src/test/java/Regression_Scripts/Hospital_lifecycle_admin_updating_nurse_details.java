package Regression_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Admin_CreateNurse_Page;
import Pom_classes.Admin_Dashboard_Page;
import Pom_classes.Login_Page;
import Pom_classes.Admin_Nurse_Page;

public class Hospital_lifecycle_admin_updating_nurse_details extends Generic_Test
{
	@Test
	public void editNurseDetails()
	{
		Login_Page a=new Login_Page(driver);
		a.sendUn("admin@admin.com");
		a.sendPwd("admin@123");
		a.clickOnLogin();
		Admin_Dashboard_Page b=new Admin_Dashboard_Page(driver);
		b.clickOnNurse();
		Admin_Nurse_Page c=new Admin_Nurse_Page(driver);
		c.clickOnSearch("abcd");
		c.clickOnEdit();
		Admin_CreateNurse_Page d=new Admin_CreateNurse_Page(driver);
		d.editUsername("abcde");
		d.editEmail("abcde12@gmail.com");
		d.clickOnSubmit();
		c.clickOnSearch("abcde");
		c.visibilityOfAbcde();
	}
}
