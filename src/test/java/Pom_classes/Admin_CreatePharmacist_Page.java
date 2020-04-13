package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Admin_CreatePharmacist_Page extends Base_Page
{
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement name;
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwd;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	
	public Admin_CreatePharmacist_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void sendUn(String un)
	{
		elementToBeCLickable(5, name);
		name.sendKeys(un);
	}
	public void sendEmail(String mail)
	{
		elementToBeCLickable(5, email);
		email.sendKeys(mail);
	}
	public void sendPwd(String password)
	{
		elementToBeCLickable(5, pwd);
		pwd.sendKeys(password);
	}
	public void clickOnSubmit()
	{
		elementToBeCLickable(5, submit);
		submit.click();
	}
	
	
}
