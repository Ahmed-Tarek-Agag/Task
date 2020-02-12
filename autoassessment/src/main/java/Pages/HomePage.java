package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//a[@class='dropdown-toggle'][contains(text(),'Desktops')]")
	WebElement desktopicon;
	
	@FindBy (xpath = "//a[contains(text(),'Show All Desktops')]")
	WebElement AllDesktop;
	
	public void EnterButtons() throws InterruptedException 
	{
		Thread.sleep(4000);
		desktopicon.click();
		AllDesktop.click();
	}
	
}
