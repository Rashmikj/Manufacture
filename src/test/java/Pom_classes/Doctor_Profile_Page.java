package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Doctor_Profile_Page extends Base_Page
{
	@FindBy(xpath="(//input[@id='field-1'])[3]")
	private WebElement phone;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	@FindBy(xpath="//input[@value='8971451245']")
	private WebElement no;
	
	
	
	
	
	
	public Doctor_Profile_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void sendPhoneNumber()
	{
		elementToBeCLickable(5, phone);
		phone.sendKeys("8971451245");
	}
	public void clickOnSubmit()
	{
		elementToBeCLickable(5, submit);
		submit.click();
	}
	public void visibilityOfNo()
	{
		visibilityOf(5, no);
	}
}
