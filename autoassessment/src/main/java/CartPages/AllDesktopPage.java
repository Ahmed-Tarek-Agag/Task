package CartPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class AllDesktopPage extends PageBase
{

	public AllDesktopPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//a[contains(text(),'Sony VAIO')]")
	WebElement sonyAveo;
	
	public void scroll() throws InterruptedException
	{
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
	}
	public void scrollDown() throws InterruptedException 
	{
		Thread.sleep(4000);
		sonyAveo.click();
	}
	

}
