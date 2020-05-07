package com.hcl.magentotest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hcl.base.WebDriverWrapper;
import com.hcl.magentopages.HomePage;
import com.hcl.magentopages.LoginPage;
import com.hcl.utilities.ExcelUtils;

public class RegisterTest extends WebDriverWrapper{
	
	@DataProvider
	public String[][] RegistrationData() throws IOException
	{
		String[][] main=ExcelUtils.getSheetIntoArray("testdata/MagentoData.xlsx","InvalidCredentialData");
		return main;
	}
	
	@Test(dataProvider="RegistrationData")
	public void RegistrationTest(String firstname,String lastname,String emailAddress,String companyType)
	{
		
		HomePage home=new HomePage(driver);
		home.clickOnMyAccountIcon();
		
		LoginPage login=new LoginPage(driver);
		login.clickOnRegister();
		
		driver.findElement(By.id("firstname")).sendKeys("balaji");
		driver.findElement(By.id("lastname")).sendKeys("dinakaran");
		driver.findElement(By.id("email_address")).sendKeys("bsa@gmail.com");
		
		//select tech partner
		Select selectCompany=new Select(driver.findElement(By.id("company_type")));
		selectCompany.selectByVisibleText(companyType);
		
		
		
		
	}

}
