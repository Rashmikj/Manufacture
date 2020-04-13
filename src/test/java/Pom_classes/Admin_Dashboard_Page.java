package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Admin_Dashboard_Page extends Base_Page
{
	@FindBy(xpath="(//a[@href='http://122.166.192.191:9007/index.php?admin/doctor'])[1]")
	private WebElement doctor;
	@FindBy(xpath="(//a[@href='http://122.166.192.191:9007/index.php?admin/patient'])[1]")
	private WebElement patient;
	@FindBy(xpath="//a[@href='http://122.166.192.191:9007/index.php?admin/nurse']")
	private WebElement nurse;
	@FindBy(xpath="(//a[@href='http://122.166.192.191:9007/index.php?admin/pharmacist'])[1]")
	private WebElement pharmacist;
	@FindBy(xpath="//a[@href='http://122.166.192.191:9007/index.php?login/logout']")
	private WebElement logout;
	
	
	
	
	
	
	
	
	public Admin_Dashboard_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public void clickOnDoctor()
	{
		elementToBeCLickable(5, doctor);
		doctor.click();
	}
	public void clickOnPatient()
	{
		elementToBeCLickable(5, patient);
		patient.click();
	}
	public void clickOnNurse()
	{
		elementToBeCLickable(5, nurse);
		nurse.click();
	}
	public void clickOnPharmacist()
	{
		elementToBeCLickable(5, pharmacist);
		pharmacist.click();
	}
	public void clickOnLogout()
	{
		elementToBeCLickable(5, logout);
		logout.click();
	}
	
}
