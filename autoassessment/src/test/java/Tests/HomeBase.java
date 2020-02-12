package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;

public class HomeBase extends TestBase
{
	HomePage HomeObject;
	
	@Test (priority=0)
	public void homePage () throws InterruptedException
	{
		HomeObject = new HomePage(driver);
		HomeObject.EnterButtons();
	}
}
