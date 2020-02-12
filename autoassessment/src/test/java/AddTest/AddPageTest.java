package AddTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class AddPageTest 
{
	// Setup environment before test , during test, after test (close browser)

		public static WebDriver driver;     // static global variable

		@BeforeSuite
		@Parameters ({"browsers"})
		public void StartDriver(@Optional("chrome")String browserName)
		{
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&path=20&product_id=46");

		}
		
		@AfterSuite
		public void StopDriver()
		{
			//driver.close();

		}
}
