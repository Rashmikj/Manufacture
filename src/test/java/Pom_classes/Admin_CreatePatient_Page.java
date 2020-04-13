package Pom_classes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Generic_Methods.Base_Page;

public class Admin_CreatePatient_Page extends Base_Page
{
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwd;
	@FindBy(xpath="//select[@name='sex']")
	private WebElement sex;
	@FindBy(xpath="//select[@name='blood_group']")
	private WebElement bloodgroup;
	@FindBy(xpath="//input[@type='number']")
	private WebElement age;
	@FindBy(xpath=" //input[@type='submit']")
	private WebElement submit;
	
	
	
	public Admin_CreatePatient_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public void sendUN(String username)
	{
		elementToBeCLickable(5, name);
		name.sendKeys(username);
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
	public void selectSex()
	{
		elementToBeCLickable(5, sex);
		Select s=new Select(sex);
		s.selectByIndex(0);
	}
	public void selectBloodgroup()
	{
		elementToBeCLickable(5, bloodgroup);
		Select s=new Select(bloodgroup);
		s.selectByIndex(0);
	}
	public void sendAge(String ageno)
	{
		elementToBeCLickable(5, age);
		age.sendKeys(ageno);
	}
	public void clickOnSubmit()
	{
		elementToBeCLickable(5, submit);
		submit.click();
	}
	public void editUn(String newname)
	{
		elementToBeCLickable(5, name);
		name.clear();
		elementToBeCLickable(5, name);
		name.sendKeys(newname);
	}
	public void editEmail(String newemail)
	{
		elementToBeCLickable(5, email);
		email.clear();
		elementToBeCLickable(5, email);
		email.sendKeys(newemail);
	}
}
