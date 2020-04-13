package Regression_Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Doctor_Add_appointment_Details_page;
import Pom_classes.Doctor_Appointment_list_page;
import Pom_classes.Doctor_Dashboard_Page;
import Pom_classes.Login_Page;

public class Hospital_lifecycle_doctor_creating_appointment_and_checking_in_appointment_list extends Generic_Test 
{
	@Test
	public void doctor_creating_appointment() throws Exception
	{
		Login_Page a=new Login_Page(driver);
		a.sendUn("siddhuc@gmail.com");
		a.sendPwd("123");
		a.clickOnLogin();
		Doctor_Dashboard_Page b=new Doctor_Dashboard_Page(driver);
		b.clickOnAppointment();
		b.clickOnAppointmentList();
		Doctor_Appointment_list_page c=new Doctor_Appointment_list_page(driver);
		c.clickOnAddAppointment();
		Doctor_Add_appointment_Details_page d=new Doctor_Add_appointment_Details_page(driver);
		d.clickOnDate();
		d.clickOnParticulardate();
		d.clickOnTime();
		d.clickOnSelectPatient();
		d.clickOnPatient();
		d.clickOnSubmit();
		c.patientIsPresent();
	}
}
