package com.klindziuk.facebook.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeftMenu {
	WebDriver driver;
	public static final By currentloggedUserLocator = By.xpath("//*[@data-testid = 'left_nav_item_Pavel Klindziuk']");
	public static final By newsFeedLocator = By.xpath("//*[@data-testid = 'left_nav_item_News Feed']");
	public static final By messengerLocator = By.xpath("//*[@data-testid = 'left_nav_item_Messenger']");
	public static final By pagesLocator = By.xpath("//*[@data-testid = 'left_nav_item_Pages']");
	public static final By eventsLocator = By.xpath("//*[@data-testid = 'left_nav_item_Groups']");
	public static final By savedLocator = By.xpath("//*[@data-testid = 'left_nav_item_Saved']");
	public static final By photosLocator = By.xpath("//*[@data-testid = 'left_nav_item_Photos']");
	public static final By advertLocator = By.linkText("Advert");
	public static final By pageLocator = By.linkText("Page");
	public static final By groupLocator = By.cssSelector("#createNav > div > a:nth-child(3)");
	public static final By eventLocator = By.cssSelector("#createNav > div > a:nth-child(4)");
	public static final By lehaLocator = By.xpath("//*[@data-href = 'https://www.facebook.com/messages/t/alexey.bulat']");
	public static final By messagePanelLocator = By.xpath("//*[@aria-label = 'Type a message...']");
	public static final By sendMessageLink = By.xpath("//*[@data-intl-translation = 'Send']");
	
    public LeftMenu(WebDriver driver){
    	this.driver = driver;
    }
    
    public void sendMessageToLeha(String message){
    	driver.findElement(messengerLocator).click();
    	waitFor(lehaLocator);
    	driver.findElement(lehaLocator).click();
    	waitFor(messagePanelLocator);
    	driver.findElement(messagePanelLocator).click();
    	driver.findElement(messagePanelLocator).sendKeys(message);
    	//send message to leha
    	//driver.findElement(sendMessageLink).click();
     }
    
    public void openCurrenuserPage(){
    	driver.findElement(currentloggedUserLocator).click();
     }
    
    public void openNewsPage() {
    	driver.findElement(newsFeedLocator).click();;
    }
    
    public void openMessenger() {
    	driver.findElement(messengerLocator).click();
    }
    
    public void openPages() {
    	driver.findElement(pageLocator).click();
    }
    
    public void openEvents() {
    	driver.findElement(eventLocator).click();;
    }
    
    public void openPhotos() {
    	driver.findElement(photosLocator).click();
    }
    
    public void openAdvert() {
    	driver.findElement(advertLocator).click();
    }
    
    public void openPage() {
    	driver.findElement(pageLocator).click();;
    }
    
    public void openGroup() {
    	driver.findElement(groupLocator).click();
    }
    
    public void openEvent() {
    	driver.findElement(eventLocator).click();
    }
    public void waitFor(By by) {
		WebDriverWait wait3 = new WebDriverWait(driver, 5);
	    wait3.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
