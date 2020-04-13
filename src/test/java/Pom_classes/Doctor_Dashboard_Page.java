package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Doctor_Dashboard_Page extends Base_Page
{
	@FindBy(xpath="(//a[@href='#'])[4]")
	private WebElement appointment;
	@FindBy(xpath="//span[.='Appointment List']")
	private WebElement appointment_list;
	@FindBy(xpath="//span[.='Dashboard']")
	private WebElement dashboard;
	@FindBy(xpath="//span[.='sfdsffsds']")
	private WebElement sfdsffsds;
	@FindBy(xpath="//span[.='Profile']")
	private WebElement profile;
	@FindBy(xpath="//a[@href='http://122.166.192.191:9007/index.php?login/logout']")
	private WebElement logout;
	
	
	 
	
	 
	 
	
	public Doctor_Dashboard_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	
	public void clickOnAppointment()
	{
		elementToBeCLickable(5, appointment);
		appointment.click();
	}
	public void clickOnAppointmentList()
	{
		elementToBeCLickable(5, appointment_list);
		appointment_list.click();
	}
	public void clickOnDashboard()
	{
		elementToBeCLickable(5, dashboard);
		dashboard.click();
	}
	public void issfdsffsdsPresent()
	{
		elementToBeCLickable(5, sfdsffsds);
	}
	public void clickOnProfile()
	{
		elementToBeCLickable(5, profile);
		profile.click();
	}
	public void clickOnLogout()
	{
		elementToBeCLickable(5, logout);
		logout.click();
	}
}
