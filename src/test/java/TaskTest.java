import browser.Browser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.SearchPage;

public class TaskTest {
	WebDriver driver;

	@Test
	public void clickFindAStudio() {
		driver = Browser.openBrowser();
		MainPage mp = new MainPage(driver);
		mp.checkTitle();
		mp.clickFindAStudio();
	}

	@Test
	public void searchForStudioZipCode() {

		SearchPage sp = new SearchPage(driver);

		sp.searchForZipCode("10011");
		sp.printSchedules("Thu");
	}

}
