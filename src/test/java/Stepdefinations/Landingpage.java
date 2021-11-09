package Stepdefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import PageObject.LandingPage;
import Utility.Takess;

import ReusableCompo.WebDriverHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Landingpage extends WebDriverHelper{
	
	static WebDriver driver = null;
	LandingPage l;
	
	@Given("^Launching the browser$")
    public void launching_the_browser() throws Throwable {
		
		driver = initializedriver();
		//	log.info("Driver is initialized");
			
    	
    }

    @When("^hitting the url through config file$")
    public void hitting_the_url_through_config_file() throws Throwable {
    	
    	driver.get(config.geturl());
		
    	
    }

    @Then("^redirected to the home page$")
    public void redirected_to_the_home_page() throws Throwable {
    	
    	l = new LandingPage(driver);
		l.searchbook().sendKeys("gmat");
		l.searchbook().sendKeys(Keys.ENTER);
		Takess.ss(driver);
	
    
    }
    
    public static WebDriver getdriver()
    {
    	return driver;
    }

}