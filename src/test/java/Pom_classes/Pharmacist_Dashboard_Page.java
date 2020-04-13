package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Pharmacist_Dashboard_Page extends Base_Page
{	
	@FindBy(xpath="//span[.='Medicine Category']")
	private WebElement medicinecategory;
	
	
	
	
	public Pharmacist_Dashboard_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public void clickOnDashboard()
	{
		elementToBeCLickable(5, medicinecategory);
		medicinecategory.click();
	}
}
