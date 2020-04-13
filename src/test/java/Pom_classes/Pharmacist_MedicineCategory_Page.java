package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Pharmacist_MedicineCategory_Page extends Base_Page
{
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	private WebElement AddMedicinCategory;
	@FindBy(xpath="( //input[@type='text'])[3]")
	private WebElement search;
	@FindBy(xpath="//td[.='cough']")
	private WebElement cough;
	
	
	
	
	public Pharmacist_MedicineCategory_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void clickOnAddMedicineCategory()
	{
		elementToBeCLickable(5, AddMedicinCategory);
		AddMedicinCategory.click();
	}
	public void sendInSearch(String name)
	{
		elementToBeCLickable(5, search);
		search.sendKeys(name);
	}
	public void isCoughPresent()
	{
		visibilityOf(5, cough);
	}
}
