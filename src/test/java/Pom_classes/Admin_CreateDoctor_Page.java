package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


import Generic_Methods.Base_Page;
public class Admin_CreateDoctor_Page extends Base_Page
{
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement name;
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	private WebElement email;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath="(//input[@id='field-1'])[4]")
	private WebElement number;
	@FindBy(xpath="//select[@name='department_id']")
	private WebElement department;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	
	
	
	
	
	public Admin_CreateDoctor_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	
	public void sendUn(String username)
	{
		elementToBeCLickable(5, name);
		name.sendKeys(username);
	}
	public void sendEmail(String mail)
	{
		elementToBeCLickable(5, email);
		email.sendKeys(mail);
	}
	public void sendPassword(String password)
	{
		elementToBeCLickable(5, pwd);
		email.sendKeys(password);
	}
	public void sendAdress(String add)
	{
		elementToBeCLickable(5, address);
		address.sendKeys(add);
	}
	public void sendNumber(String no)
	{
		elementToBeCLickable(5, number);
		number.sendKeys(no);
	}
	public void selectDepartment()
	{
		elementToBeCLickable(5, department);
		Select s=new Select(department);
		s.selectByIndex(1);
	}
	public void clickOnSubmit()
	{
		elementToBeCLickable(5, submit);
		submit.click();
	}
	public void clearName(String newName)
	{
		elementToBeCLickable(5, name);
		name.clear();
		elementToBeCLickable(5, name);
		name.sendKeys(newName);
	}
	public void clearEmail(String newEmail)
	{
		elementToBeCLickable(5, email);
		email.clear();
		elementToBeCLickable(5, email);
		email.sendKeys(newEmail);
	}
	
}
