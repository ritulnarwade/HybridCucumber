package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {


	WebDriver driver;
	
	By searchbox = By.id("searchbox");
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement searchbook()
	{
		return driver.findElement(searchbox);
	}

	
}
