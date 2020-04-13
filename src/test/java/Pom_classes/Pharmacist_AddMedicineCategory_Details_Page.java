package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Pharmacist_AddMedicineCategory_Details_Page extends Base_Page
{	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement name;
	@FindBy(xpath="//textarea[@id='field-ta']")
	private WebElement medicinecategoryDescription;
	@FindBy(xpath="//input[@class='btn btn-success']")
	private WebElement button;
	
	
	
	public Pharmacist_AddMedicineCategory_Details_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public void sendCAtegoryName(String catname)
	{
		elementToBeCLickable(5, name);
		name.sendKeys(catname);
	}
	public void sendmedicineCategoryDescription(String des)
	{
		elementToBeCLickable(5, medicinecategoryDescription);
		medicinecategoryDescription.sendKeys(des);
	}
	public void clickOnSubmit()
	{
		elementToBeCLickable(5, button);
		button.click();
	}
}
