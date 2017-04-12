import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.klindziuk.facebook.elements.LeftMenu;
import com.klindziuk.page.LoginPage;

public class Runner {
	public static final String BASEURL = "https://www.facebook.com";
		
	public static void main (String[] args) {
	
		WebDriver driver = BrowserDriver.IEXPLORER.selectDriver();
		driver.get(BASEURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginAs("fennya@gmail.com", "nexusp29");
		LeftMenu leftMenu = new LeftMenu(driver);
		leftMenu.sendMessageToLeha("WebDriver: Я ушла в магазин.(Это я показываю работу маме)");
		BrowserDriver.IEXPLORER.killDriver();
	}
}
		
//CHECK FOR HEADER ELEMENTS		
		
//			driver.findElement(faceBookLogoLocator).click();
//		waiter(searchBoxLocator);
//		driver.findElement(searchBoxLocator).sendKeys("message");
//		driver.findElement(searchButtonLocator).click();
//		waiter(profileLinkLocator);
//		driver.findElement(profileLinkLocator).click();
//	    waiter(Header.homeLinkLocator);
//	    driver.findElement(Header.homeLinkLocator).click();
//	    waiter(findFriendsLinkLocator);
//		driver.findElement(findFriendsLinkLocator).click();
//	    waiter(friendsRequestsLocator); 
//		driver.findElement(friendsRequestsLocator).click();
//		waiter(messagesLocator);
//		driver.findElement(messagesLocator).click();
//		waiter(notificationsLocator);
//		driver.findElement(notificationsLocator).click();
//		waiter(quickHelpLocator);
//		driver.findElement(quickHelpLocator).click();
//		waiter(userNavigationLocator);
//		driver.findElement(userNavigationLocator).click();
//		waiter(messagesLocator);
//		driver.findElement(messagesLocator).click();
//		waiter(homeLinkLocator);
//	    driver.findElement(homeLinkLocator).click();
//	    waiter(messenger);
	    
//		driver.findElement(messagePanelLocator).sendKeys("WebDriver:Trying to resend....");
		
	//String s = driver.findElement(By.xpath("//*[text() = 'Send my answer back ']")).getText();
//	    driver.findElement(messagePanelLocator).sendKeys(s);
//	    driver.findElement(sendMessageLink).click();
//	}
//	public static void waiter(By by) {
//		WebDriverWait wait3 = new WebDriverWait(driver, 5);
//	    wait3.until(ExpectedConditions.visibilityOfElementLocated(by));
//
//	}

//}
