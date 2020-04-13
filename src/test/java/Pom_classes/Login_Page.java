package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Generic_Methods.Base_Page;

public class Login_Page extends Base_Page
{
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement username;
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	private WebElement password;
	@FindBy(xpath="//button[@class='btn btn-primary btn-block btn-login']")
	private WebElement login;
	
	
	public Login_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public void sendUn(String un)
	{
		elementToBeCLickable(5, username);
		username.sendKeys(un);
	}
	public void sendPwd(String pwd)
	{
		elementToBeCLickable(5, password);
		password.sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		elementToBeCLickable(5, login);
		login.click();
	}
	public void waitUntilUrlContains()
	{
		urlContains(10, "http://122.166.192.191:9007/index.php?/admin/dashboard");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Admin Dashboard - HospitaManagement System");
		System.out.println(title);
	}
	
}
