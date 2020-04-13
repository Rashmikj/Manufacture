package Regression_Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import Generic_Methods.Generic_Test;
import Pom_classes.Doctor_Add_appointment_Details_page;
import Pom_classes.Doctor_Appointment_list_page;
import Pom_classes.Doctor_Dashboard_Page;
import Pom_classes.Login_Page;

public class Hospital_lifecycle_Doctor_Creating_appointment_for_patient_and_cheking_his_calender extends Generic_Test 
{
	@Test
	public void creatingAppoinytment() throws Exception
	{	
		test=reports.createTest("creating appointment", "doctor creating appointment");
		test.info("test has started");
		Login_Page a=new Login_Page(driver);
		a.sendUn("siddhuc@gmail.com");
		test.pass("un sent");
		a.sendPwd("123");
		test.pass("pwd sent");
		a.clickOnLogin();
		test.pass("clicked");
		Doctor_Dashboard_Page b=new Doctor_Dashboard_Page(driver);
		b.clickOnAppointment();
		test.pass("clicked on appointment");
		b.clickOnAppointmentList();
		test.pass("click on appointment list");
		Doctor_Appointment_list_page c=new Doctor_Appointment_list_page(driver);
		c.clickOnAddAppointment();
		test.pass("click on add appointment");
		Doctor_Add_appointment_Details_page d=new Doctor_Add_appointment_Details_page(driver);
		d.clickOnDate();
		test.pass("click on date");
		d.clickOnParticulardate();
		test.pass("click on particular date");
		d.clickOnTime();
		test.pass("click on time");
		d.clickOnSelectPatient();
		test.pass("seleced a patient");
		d.clickOnPatient();
		test.pass("clicked on patient");
		d.clickOnSubmit();
		test.pass("clicked on submit");
		c.patientIsPresent();
		test.pass("patient is present");
		b.clickOnDashboard();
		test.pass("clicked on dashboard");
		b.issfdsffsdsPresent();
		test.pass("present");
		test.info("test has ended");
	}
}
