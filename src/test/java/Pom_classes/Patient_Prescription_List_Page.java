package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;
import Generic_Methods.Generic_Test;

public class Patient_Prescription_List_Page extends Base_Page
{

	@FindBy(xpath="(//a[@class='btn btn-default btn-sm btn-icon icon-left'])[1]")
	private WebElement viewPrescription;
	
	
	
	
	
	
	public Patient_Prescription_List_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public void visibilityOfPrescription()
	{
		visibilityOf(5, viewPrescription);
	}
	
}
