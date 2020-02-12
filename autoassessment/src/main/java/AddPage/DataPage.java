package AddPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.PageBase;

public class DataPage extends PageBase
{

	public DataPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id="input-quantity")
	WebElement QTY;
	
	@FindBy (id="button-cart")
	WebElement addButton;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement confirmMessage;
	
	public void addBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		QTY.clear();
		QTY.sendKeys("2");
		
		Thread.sleep(2000);
		addButton.click();
		
		Thread.sleep(2000);
		System.out.println(confirmMessage.getText());
	}
}
