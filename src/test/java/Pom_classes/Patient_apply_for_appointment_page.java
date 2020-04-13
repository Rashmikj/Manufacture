package Pom_classes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;
import Generic_Methods.Generic_Test;

public class Patient_apply_for_appointment_page extends Base_Page
{

	@FindBy(xpath="//input[@placeholder='date here']")
	private WebElement date;
	@FindBy(xpath="//td[.='21']")
	private WebElement particulardate;
	@FindBy(xpath="//input[@name='time_timestamp']")
	private WebElement time;
	@FindBy(xpath="(//span[@class='select2-chosen'])[2]")
	private WebElement clickOnDropdown;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	
	
	
	
	
	
	public Patient_apply_for_appointment_page(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void clickOnDate() 
	{
		elementToBeCLickable(5, date);
		date.click();
	}
	public void clickOnParticulardate() throws Exception
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void clickOnTime()
	{
		elementToBeCLickable(5, time);
		time.clear();
		elementToBeCLickable(5, time);
		time.sendKeys("20");
	}
	public void clickOnDropdown() throws Exception
	{
		elementToBeCLickable(5, clickOnDropdown);
		clickOnDropdown.click();
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
