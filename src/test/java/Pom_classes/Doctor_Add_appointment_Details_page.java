package Pom_classes;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Doctor_Add_appointment_Details_page extends Base_Page
{
	@FindBy(xpath="//input[@class='form-control datepicker']")
	private WebElement date;
	@FindBy(xpath="(//td[.='7'])[1]")
	private WebElement particular_date;
	@FindBy(xpath="//input[@class='form-control timepicker']")
	private WebElement time;
	@FindBy(xpath="//span[.='Kumar']")
	private WebElement patient;
	@FindBy(xpath="//span[.='Select Patient']")
	private WebElement select_patient;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	

	
	
	public Doctor_Add_appointment_Details_page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public void clickOnDate()
	{
		elementToBeCLickable(5, date);
		date.click();
	}
	public void clickOnParticulardate()
	{
		elementToBeCLickable(5, particular_date);
		particular_date.click();
	}
	public void clickOnTime()
	{
		elementToBeCLickable(5, time);
		time.click();
	}
	public void clickOnSelectPatient()
	{
		elementToBeCLickable(5, select_patient);
		select_patient.click();
	}
	public void clickOnPatient() throws Exception
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void clickOnSubmit()
	{
		elementToBeCLickable(5, submit);
		submit.click();
	}
	
	
}
