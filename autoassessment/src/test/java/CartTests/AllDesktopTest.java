package CartTests;

import org.testng.annotations.Test;

import CartPages.AllDesktopPage;
import Pages.HomePage;
import Tests.TestBase;

public class AllDesktopTest extends TestBase
{
	AllDesktopPage pageObject;
	HomePage HomeObject;

	@Test (priority=0)
	public void homePage () throws InterruptedException
	{
		HomeObject = new HomePage(driver);
		HomeObject.EnterButtons();
	}

	@Test (priority=0)
	public void scrollTest () throws InterruptedException
	{
		pageObject = new AllDesktopPage(driver);
		pageObject.scrollDown();
	}
}
