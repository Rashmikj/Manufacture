package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Admin_Pharmacist_Page extends Base_Page
{
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	private WebElement pharmacist;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement search;
	@FindBy(xpath="//td[.='aaa']")
	private WebElement aaa;
	
	
	
	public Admin_Pharmacist_Page (WebDriver driver)
	{
		super(driver);
	}
	
	
	public void clickOnAddPharmacist()
	{
		elementToBeCLickable(5, pharmacist);
		pharmacist.click();
	}
	public void clickOnSearch(String name)
	{
		elementToBeCLickable(5, search);
		search.sendKeys(name);
	}
	public void isAAApresent()
	{
		visibilityOf(5, aaa);
	}
}
