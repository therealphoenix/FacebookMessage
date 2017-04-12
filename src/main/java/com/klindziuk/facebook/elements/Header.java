package com.klindziuk.facebook.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header {
	WebDriver driver;
	public static final By faceBookLogoLocator = By.xpath("//*[@href = 'https://www.facebook.com/?ref=logo']");
	public static final By searchBoxLocator = By.name("q");
	public static final By searchButtonLocator = By.xpath("//*[@data-testid = 'facebar_search_button']");
	public static final By profileLinkLocator = By.xpath("//*[@title = 'Profile']");
	public static final By homeLinkLocator = By.id("u_0_5");
	public static final By findFriendsLinkLocator = By.id("findFriendsNav");
	public static final By friendsRequestsLocator = By.xpath("//*[@data-testid = 'requests_jewel']");
	public static final By messagesLocator = By.xpath("//*[@data-tooltip-content = 'Messages']");
	public static final By notificationsLocator = By.xpath("//*[@data-tooltip-content = 'Notifications']");
	public static final By quickHelpLocator = By.xpath("//*[@data-tooltip-content = 'Quick Help']");
	public static final By userNavigationLocator = By.id("userNavigationLabel");

	public Header(WebDriver driver) {
		this.driver = driver;
	}

	public void openUserNavigation() {
		driver.findElement(userNavigationLocator).click();
	}

	public void openQuickHelp() {
		driver.findElement(quickHelpLocator).click();
	}

	public void openNotifications() {
		driver.findElement(notificationsLocator).click();
	}

	public void openMessages() {
		driver.findElement(messagesLocator).click();
	}

	public void openFriendRequests() {
		driver.findElement(friendsRequestsLocator).click();
	}

	public void openFindFriends() {
		waitFor(findFriendsLinkLocator);
		driver.findElement(findFriendsLinkLocator).click();
	}

	public void openHome() {
		waitFor(homeLinkLocator);
		driver.findElement(homeLinkLocator).click();
	}

	public void openProfile() {
		waitFor(profileLinkLocator);
		driver.findElement(profileLinkLocator).click();
	}

	public void openFacebook() {
		driver.findElement(faceBookLogoLocator);
	}

	public void typeInSearchBox(String message) {
		waitFor(searchBoxLocator);
		driver.findElement(searchBoxLocator).sendKeys(message);
	}

	public void pushSearchButtont() {
		driver.findElement(searchButtonLocator).click();
	}

	public void waitFor(By by) {
		WebDriverWait wait3 = new WebDriverWait(driver, 5);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
