package com.klindziuk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	WebDriver driver;
	static By englishLocator = By.xpath("//*[@title ='English (US)']");
	static By emailLocator = By.id("email"); 
	static By passwordLocator = By.id("pass");
	static By loginButtonLocator = By.xpath("//*[@type = 'submit']");
	
public LoginPage(WebDriver driver){
	super(driver);
	this.driver = driver;
}
	
public void setEnglish(){
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)", "");
	if(driver.findElements(englishLocator).size() > 0) {
	driver.findElement(englishLocator).click();
	}
}

public void setEmail(String email) {
	waitFor(emailLocator);
	driver.findElement(emailLocator).sendKeys(email);
}

public void setPassword(String password) {
	driver.findElement(passwordLocator).sendKeys(password);
}

public void pushLoginButton() {
	driver.findElement(loginButtonLocator).click();	
}

public void loginAs(String email, String password){
	setEnglish();
	setEmail(email);
	setPassword(password);
	pushLoginButton();
	}
}
