package com.klindziuk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.klindziuk.facebook.elements.Header;
import com.klindziuk.facebook.elements.LeftMenu;

public class BasePage {
	WebDriver driver;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public Header getHeader() {
		return new Header(driver);
	}
	
	public LeftMenu getLeftMenu() {
		return new LeftMenu(driver);
	}
	
	public void waitFor(By by) {
		WebDriverWait wait3 = new WebDriverWait(driver, 5);
	    wait3.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
