package pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchPage {

	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='meetingSearch']")
	private WebElement searchField;

	@FindBy(how = How.XPATH, using = "//*[@id='content']/div/div/ui-view/ui-view/div/div/div/div/div[2]/div[1]/div/form/div[1]/span/button")
	private WebElement searchButton;

	@FindBy(how = How.XPATH, using = "//div[@class='meeting-locations-list']/div[1]//div[@class='location__name']/span")
	private WebElement firstLocationName;

	@FindBy(how = How.XPATH, using = "//div[@class='meeting-locations-list']/div[1]//div[@class='location__distance']")
	private WebElement firstLocationDistance;

	public void checkTitle() {
		Assert.assertEquals("Find a Studio & Meeting Near You | WW USA",
				driver.getTitle());
	}

	public void searchForZipCode(String zipCode) {

		searchField.sendKeys(zipCode);
		searchButton.click();

		System.out.println(firstLocationName.getText());
		System.out.println(firstLocationDistance.getText());

		firstLocationName.click();

	}

	public void printSchedules(String day) {
		String xpathStr = "//div[@class='schedule-detailed-day']/div[contains(text(), '"
				+ day + "')]/following-sibling::*/div/div";
		String xpathStr1 = "//div[@class='schedule-detailed-day']/div[contains(text(), '"
				+ day + "')]/following-sibling::*/div";
		int sz = driver.findElements(By.xpath("xpathStr1")).size();
		
		 Map<String, Integer> res = new HashMap<>();

	        for(int i = 0; i<sz; i++){
	        	String element1= driver.findElement(By.xpath("xpathStr")).getText();
	        	String element2= driver.findElement(By.xpath("xpathStr")).getText();
	        	
	        	if(res.get(element1)!=null)res.put(element1, res.get(element1)+1);
	        	else res.put(element1, 1);
	        
	        }
	        
	        for(Map.Entry mp : res.entrySet()){
                System.out.println("Name: "+mp.getKey()+", Schedule count: "+mp.getValue());
            }
	}

}
