package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Nurse_Dashboard_Page extends Base_Page
{
	@FindBy(xpath="//a[@href='http://122.166.192.191:9007/index.php?nurse/patient']")
	private WebElement patient;
	
	
	
	public Nurse_Dashboard_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public void clickOnPAtient()
	{
		elementToBeCLickable(5, patient);
		patient.click();
	}
}
