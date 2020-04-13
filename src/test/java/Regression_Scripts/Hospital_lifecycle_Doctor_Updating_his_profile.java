package Regression_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Doctor_Dashboard_Page;
import Pom_classes.Doctor_Profile_Page;
import Pom_classes.Login_Page;

public class Hospital_lifecycle_Doctor_Updating_his_profile extends Generic_Test
{
	@Test
	public void updateProfile()
	{	
		test=reports.createTest("doctor updating his profile", "doctor should be able to update his profile");
		test.info("Regression test has started");
		Login_Page a=new Login_Page(driver);
		a.sendUn("siddhuc@gmail.com");
		test.pass("email has been entered");
		a.sendPwd("123");
		test.pass("password has been entered");
		a.clickOnLogin();
		test.pass("login done");
		Doctor_Dashboard_Page b=new Doctor_Dashboard_Page(driver);
		b.clickOnProfile();
		test.pass("clicked on profile");
		Doctor_Profile_Page c=new Doctor_Profile_Page(driver);
		c.sendPhoneNumber();
		test.pass("phone no sent");
		c.clickOnSubmit();
		test.pass("clicked on submit");
		c.visibilityOfNo();
		test.pass("visible");
		b.clickOnLogout();
		test.pass("successfully logged out");
		test.info("Regression test ended");
	}
}
