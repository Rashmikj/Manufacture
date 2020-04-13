package Regression_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Methods.Generic_Test;
import Pom_classes.Login_Page;
import Pom_classes.Pharmacist_AddMedicineCategory_Details_Page;
import Pom_classes.Pharmacist_Dashboard_Page;
import Pom_classes.Pharmacist_MedicineCategory_Page;

public class HospitalLifecycle_Pharmacist_Adding_Category_AndCheccking_Under_List extends Generic_Test
{
	@Test
	public void creatingMedicineCategory()
	{	
		test=reports.createTest("MedicineCategory", "Adding and checking");
		test.info("Test started");
		Login_Page a=new Login_Page(driver);
		a.sendUn("siddhuc123@gmail.com");
		test.info("mail sent");
		a.sendPwd("123");
		test.info("pwd sent");
		a.clickOnLogin();
		test.info("CLicked on login");
		Assert.assertEquals(driver.getTitle(), "Login | HospitaManagement System");
		test.info("Title verified");
		
		Pharmacist_Dashboard_Page b=new Pharmacist_Dashboard_Page(driver);
		b.clickOnDashboard();
		test.info("Clicked on dashboard");
		
		Pharmacist_MedicineCategory_Page c=new Pharmacist_MedicineCategory_Page(driver);
		c.clickOnAddMedicineCategory();
		test.info("Clicked on add medicine category");
		
		Pharmacist_AddMedicineCategory_Details_Page d=new Pharmacist_AddMedicineCategory_Details_Page(driver);
		d.sendCAtegoryName("cough");
		test.info("Category name sent");
		d.sendmedicineCategoryDescription("Related to cough");
		test.info("Description sent");
		d.clickOnSubmit();
		test.info("Clicked on submit");
		
		c.sendInSearch("cough");
		test.info("Searched for cogh");
		c.isCoughPresent();
		test.info("Cough is present");
		
	}
}
