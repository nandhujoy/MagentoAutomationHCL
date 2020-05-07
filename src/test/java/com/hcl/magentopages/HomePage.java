package com.hcl.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private By myAccIconLocator = By.xpath("//a[@data-adobe-name='Header|GlobalNav|MyAccountClick']");

	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnMyAccountIcon() {
		WebElement myAccEle = driver.findElement(myAccIconLocator);
		myAccEle.click();
	}
}
