package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Admin_Nurse_Page extends Base_Page
{
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	private WebElement nurse;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement search;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement zzz;
	@FindBy(xpath="//a[@class='btn btn-default btn-sm btn-icon icon-left']")
	private WebElement edit;
	@FindBy(xpath="//td[.='abcde']")
	private WebElement abcde;
	
	
	public Admin_Nurse_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void clickOnAddnurse()
	{
		elementToBeCLickable(5, nurse);
		nurse.click();
	}
	public void clickOnSearch(String name)
	{
		elementToBeCLickable(5, search);
		search.sendKeys(name);
	}
	public void isNursePresent()
	{
		visibilityOf(5, zzz);
	}
	public void clickOnEdit()
	{
		elementToBeCLickable(5, edit);
		edit.click();
	}
	public void visibilityOfAbcde()
	{
		visibilityOf(5, abcde);
	}
}
