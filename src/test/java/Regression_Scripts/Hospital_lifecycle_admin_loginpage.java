package Regression_Scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Methods.Dataprovider;
import Generic_Methods.Generic_Test;
import Pom_classes.Login_Page;

public class Hospital_lifecycle_admin_loginpage extends Generic_Test
{	
	
	@Test(dataProvider="authentication")
	public void loginPage(String un, String pwd)
	{
		Login_Page a=new Login_Page(driver);
		a.sendUn(un);
		a.sendPwd(pwd);
		a.clickOnLogin();
	}
	
	@DataProvider(name="authentication")
	public Object[][] getdata()
	{
		Object[][] arrobj = Dataprovider.getData("Sheet1");
		return arrobj;
	}
}
