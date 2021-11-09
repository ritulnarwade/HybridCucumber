package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBook {
	
	WebDriver driver;
	
	By book = By.xpath("//*[@id=\'maincontent\']/div/div/div/div[1]/div[3]/div[2]/div[2]/ol/li[1]/div/div/div[2]/h2/a");
	
	By addtocart = By.xpath("//*[@id=\'product-addtocart-button\']");
	
	public SearchBook(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement book()
	{
		return driver.findElement(book);
	}
	
	public WebElement clickaddtocart()
	{
		return driver.findElement(addtocart);
	}


}
