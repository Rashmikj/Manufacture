package Regression_Scripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import Generic_Methods.Generic_Test;
import Pom_classes.Login_Page;
import Pom_classes.Patient_Dashboard_Page;
import Pom_classes.Patient_Prescription_List_Page;

public class Hospital_lifecycle_Patient_Viewing_prescription extends Generic_Test
{
	@Test
	public void viewingPrescription()
	{	
		log.info("Viewing prescrition test script");
		test=reports.createTest("viewing_prescription", "prescription should be present under the list");
		test.info("Test startted");
		Login_Page a=new Login_Page(driver);
		a.sendUn("siddhuc@gmail.com");
		test.pass("un sent");
		a.sendPwd("123");
		test.pass("pwd sent");
		a.clickOnLogin();
		test.pass("clicked on login");
		Patient_Dashboard_Page b=new Patient_Dashboard_Page(driver);
		b.clickOnPrescription();
		test.pass("clicked on prescription");
		Patient_Prescription_List_Page c=new Patient_Prescription_List_Page(driver);
		c.visibilityOfPrescription();
		test.pass("visible");
		test.info("test ended");
		log.info("");
	}
}
