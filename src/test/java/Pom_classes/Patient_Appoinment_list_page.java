package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;
import Generic_Methods.Generic_Test;

public class Patient_Appoinment_list_page extends Base_Page
{

	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	private WebElement applyforAppointment;
	
	
	
	
	
	
	public Patient_Appoinment_list_page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public void clickOnApplyforAppointment()
	{
		visibilityOf(5, applyforAppointment);
		applyforAppointment.click();
	}
	
}
