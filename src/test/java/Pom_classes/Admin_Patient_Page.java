package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Admin_Patient_Page extends Base_Page
{
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	private WebElement patient;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement search;
	@FindBy(xpath="//td[.='yyy']")
	private WebElement yyy;
	@FindBy(xpath="//a[@class='btn btn-default btn-sm btn-icon icon-left']")
	private WebElement edit;
	@FindBy(xpath="//td[.='abcde']")
	private WebElement abcde;
	@FindBy(xpath="//td[.='tanush']")
	private WebElement tanush;
	
	
	
	
	public Admin_Patient_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void clickOnAddPatient()
	{
		elementToBeCLickable(5, patient);
		patient.click();
	}
	public void clickOnSearch(String name)
	{
		elementToBeCLickable(5, search);
		search.sendKeys(name);
	}
	public void isYYYpresent()
	{
		visibilityOf(5, yyy);
	}
	public void clickOnEdit()
	{
		elementToBeCLickable(5, edit);
		edit.click();
	}
	public void isAbcdepresent()
	{
		visibilityOf(5, abcde);
	}
	public void isTanushpresent()
	{
		visibilityOf(5, tanush);
	}
}
