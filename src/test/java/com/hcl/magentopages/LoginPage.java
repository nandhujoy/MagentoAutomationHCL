package com.hcl.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private By emailLocator = By.id("email");
	private By passLocator = By.id("pass");
	private By loginLocator = By.id("send2");
	private By errorLocator = By.id("//div[contains(text(),'Invalid')]");

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void sendEmailAddress(String username) {
		WebElement emailEle = driver.findElement(emailLocator);
		emailEle.sendKeys(username);
	}

	public void sendPassword(String password) {
		WebElement passEle = driver.findElement(passLocator);
		passEle.sendKeys(password);
	}

	public void clickOnLogin() {
		WebElement loginEle = driver.findElement(loginLocator);
		loginEle.click();
	}

	public String getErrorMessage() {
		WebElement errorEle = driver.findElement(errorLocator);
		String text = errorEle.getText();
		return text;
	}
	
	public void clickOnRegister() {
		
	}

}
