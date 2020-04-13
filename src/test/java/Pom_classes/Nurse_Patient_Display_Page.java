package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Nurse_Patient_Display_Page extends Base_Page
{
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	private WebElement addpatient;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement patientpresent;
	@FindBy(xpath="(//input[.='Sidd']")
	private WebElement siddIsPresent;
	
	
	
	public Nurse_Patient_Display_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void clickOnAddPatient()
	{
		elementToBeCLickable(5, addpatient);
		addpatient.click();
	}
	public void sendName()
	{
		elementToBeCLickable(5, patientpresent);
		patientpresent.sendKeys("Sidd");
	}
	public void isSidPresent()
	{
		elementToBeCLickable(5, siddIsPresent);
	}
}
