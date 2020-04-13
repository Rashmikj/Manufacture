package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Doctor_Appointment_list_page extends Base_Page
{
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	private WebElement add_appointment;
	@FindBy(xpath="(//td[@class=' '])[2]")
	private WebElement patient;
	
	
	
	
	public Doctor_Appointment_list_page(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void clickOnAddAppointment()
	{
		elementToBeCLickable(5, add_appointment);
		add_appointment.click();
	}
	public void patientIsPresent()
	{
		elementToBeCLickable(5, patient);
	}
	
}
