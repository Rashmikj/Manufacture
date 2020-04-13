package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Patient_Dashboard_Page extends Base_Page
{
	@FindBy(xpath="//i[@class='fa fa-stethoscope']")
	private WebElement prescription;
	@FindBy(xpath="//span[.='Appointment']")
	private WebElement appointment;
	@FindBy(xpath="//span[.='Appointment List']")
	private WebElement appointmentList;
	
	
	
	
	
	
	public Patient_Dashboard_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	
	public void clickOnPrescription()
	{
		elementToBeCLickable(5, prescription);
		prescription.click();
	}
	public void clickOnAppointmet()
	{
		elementToBeCLickable(5, appointment);
		appointment.click();
	}
	public void clickOnAppointmentList()
	{
		elementToBeCLickable(5, appointmentList);
		appointmentList.click();
	}
}
