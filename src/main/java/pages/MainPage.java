package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import browser.Browser;

public class MainPage {
	WebDriver driver;
	
	public MainPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//a[@id='ela-menu-visitor-desktop-supplementa_find-a-studio']")
    private WebElement findAStudio;
	
	public void checkTitle(){
		Assert.assertEquals("WW (Weight Watchers): Weight Loss & Wellness Help", driver.getTitle());
    }
	
	public void clickFindAStudio(){
		findAStudio.click();
    }
}
