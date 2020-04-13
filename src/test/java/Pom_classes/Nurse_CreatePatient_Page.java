package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Nurse_CreatePatient_Page extends Base_Page
{
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement patientname;
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	private WebElement patientemail;
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement patientpwd;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	
	
	public Nurse_CreatePatient_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void sendUn()
	{
		elementToBeCLickable(5, patientname);
		patientname.sendKeys("Siddhuc C");
	}
	public void sendEmail()
	{
		elementToBeCLickable(5, patientemail);
		patientemail.sendKeys("siddhuc123456@gmail.com");
	}
	public void sendPwd()
	{
		elementToBeCLickable(5, patientpwd);
		patientpwd.sendKeys("123");
	}
	public void clickOnSubmit()
	{
		elementToBeCLickable(5, submit);
		submit.click();
	}
}
