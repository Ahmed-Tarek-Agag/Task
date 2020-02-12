package AddTest;

import org.testng.annotations.Test;

import AddPage.DataPage;
import CartPages.AllDesktopPage;
import Pages.HomePage;
import Tests.TestBase;

public class DataTest extends TestBase
{
	AllDesktopPage pageObject;
	HomePage HomeObject;
	DataPage DataObject;

	@Test (priority=0)
	public void homePage () throws InterruptedException
	{
		HomeObject = new HomePage(driver);
		HomeObject.EnterButtons();
	}

	@Test (priority=1)
	public void scrollTest () throws InterruptedException
	{
		pageObject = new AllDesktopPage(driver);
		pageObject.scrollDown();
	}
	
	@Test (priority =2)
	public void pageData () throws InterruptedException
	{
		DataObject = new DataPage(driver);
		DataObject.addBtn();
	}
}
