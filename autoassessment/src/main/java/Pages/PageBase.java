package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase
{
	protected WebDriver driver;
	// create constructor to initialize elements
		public PageBase (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		// making method for clicking buttons
		public static void clickButton (WebElement Button)
		{
			Button.click();
		}
		
		// making method for sending data 
		public static void sendData (WebElement data , String value)
		{
			data.sendKeys(value);
		}
}
