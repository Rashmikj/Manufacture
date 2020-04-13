package Regression_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Login_Page;
import Pom_classes.Nurse_CreatePatient_Page;
import Pom_classes.Nurse_Dashboard_Page;
import Pom_classes.Nurse_Patient_Display_Page;

public class Hosipital_lifecycle_Nurse_Creating_Patient_And_CheckingInList extends Generic_Test
{
	@Test
	public void nursecreatingPatient()
	{	
		test=reports.createTest("Creating patient", "nurse creating patient");
		test.info("Tes started");
		Login_Page a=new Login_Page(driver);
		a.sendUn("siddhuc12@gmail.com");
		a.sendPwd("123");
		a.clickOnLogin();
		Nurse_Dashboard_Page b=new Nurse_Dashboard_Page(driver);
		b.clickOnPAtient();
		Nurse_CreatePatient_Page c=new Nurse_CreatePatient_Page(driver);
		c.sendUn();
		c.sendEmail();
		c.sendPwd();
		c.clickOnSubmit();
		Nurse_Patient_Display_Page d=new Nurse_Patient_Display_Page(driver);
		d.sendName();
		d.isSidPresent();
		test.info("test has ended");
	}
}
