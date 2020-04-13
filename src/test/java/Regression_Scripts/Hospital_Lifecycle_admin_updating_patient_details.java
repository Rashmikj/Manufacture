package Regression_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Admin_CreatePatient_Page;
import Pom_classes.Admin_Dashboard_Page;
import Pom_classes.Login_Page;
import Pom_classes.Admin_Patient_Page;

public class Hospital_Lifecycle_admin_updating_patient_details extends Generic_Test
{
	@Test
	public void updatePatient()
	{
		Login_Page a=new Login_Page(driver);
		a.sendUn("admin@admin.com");
		a.sendPwd("admin@123");
		a.clickOnLogin();
		Admin_Dashboard_Page b=new Admin_Dashboard_Page(driver);
		b.clickOnPatient();
		Admin_Patient_Page c=new Admin_Patient_Page(driver);
		c.clickOnSearch("abcd");
		c.clickOnEdit();
		Admin_CreatePatient_Page d=new Admin_CreatePatient_Page(driver);
		d.editUn("abcde");
		d.editEmail("abcde1@gmail.com");
		d.clickOnSubmit();
		c.clickOnSearch("abcde");
		c.isAbcdepresent(); 
	}
}
