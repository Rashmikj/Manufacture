package Generic_Classes;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Basepage {

	public WebDriver driver;
	
	
	public Basepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyElement(int time, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		try {
			
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO: handle exception
			
			 System.out.println("failed to locate element");
		} 
	}

	
	public void ElementTObeClickable(int time, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println("failed to click  element");
		}
	}
	
	
	public void presenceOfElementLocatedByLoator(int time, String value)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		try
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
		}
		catch(Exception e)
		{
			System.out.println("Failed to check presence");
		}
	}
	
	public void titleContains(int time, String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e)
		{
			System.out.println("Failed waitt until title contains");
		}
	}
	public void titleToBE(int time, String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		try
		{
			wait.until(ExpectedConditions.titleIs(title));
		}
		catch(Exception e)
		{
			System.out.println("Failed to wait until title is");
		}
	}
	public void urlContains(int time, String url)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		try
		{
			wait.until(ExpectedConditions.urlContains(url));
		}
		catch(Exception e)
		{
			System.out.println("Failed to wait until url contains");
		}
	}
	public void urlToBe(int time, String url)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		try
		{
			wait.until(ExpectedConditions.urlToBe(url));
		}
		catch(Exception e)
		{
			System.out.println("Failed to wait until url to be");
		}
	}
	public void noOfWindowToBe(int time, int no)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		try
		{
			wait.until(ExpectedConditions.numberOfWindowsToBe(no));
		}
		catch(Exception e)
		{
			System.out.println("Failed to wait until window loads");
		}
	}
	public void alertIsPresent(int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		try
		{
			wait.until(ExpectedConditions.alertIsPresent());
		}
		catch(Exception e)
		{
			System.out.println("Failed to wait until alertt is present");
		}
	}
	public void frameToBeAvailableAndSwitchToIt(int time, int no)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		try
		{
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(no));
		}
		catch(Exception e)
		{
			System.out.println("Failed to wait until window loads");
		}
	}
	
	
	
}
