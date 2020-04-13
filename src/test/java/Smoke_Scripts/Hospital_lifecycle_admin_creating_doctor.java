package Smoke_Scripts;

import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Admin_CreateDoctor_Page;
import Pom_classes.Admin_Dashboard_Page;
import Pom_classes.Admin_Doctor_Page;
import Pom_classes.Login_Page;

public class Hospital_lifecycle_admin_creating_doctor extends Generic_Test
{
	@Test
	public void createDoctor()
	{
		Login_Page a=new Login_Page(driver);
		a.sendUn("admin@admin.com");
		a.sendPwd("admin@123");
		a.clickOnLogin();
		Admin_Dashboard_Page b=new Admin_Dashboard_Page(driver);
		b.clickOnDoctor();
		Admin_Doctor_Page c=new Admin_Doctor_Page(driver);
		c.clickOnAddDoctor();
		Admin_CreateDoctor_Page d=new Admin_CreateDoctor_Page(driver);
		d.sendUn("xxx");
		d.sendEmail("xxx@gmail.com");
		d.sendPassword("123");
		d.sendAdress("xxxxxx,yyyyyy,zzzzz");
		d.sendNumber("8954145214");
		d.selectDepartment();
		d.clickOnSubmit();
		c.clickOnSearch("xxx");
		c.elementVisible();
	}
}
