package Stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import PageObject.SearchBook;

@RunWith(Cucumber.class)
public class searchbook {
	
	static WebDriver driver=null;
	SearchBook sb;

    @Given("^getting driver from landingpage$")
    public void getting_driver_from_landingpage() throws Throwable {
    	
    	driver = Landingpage.getdriver();
    	
    }

    @When("^selecting the book$")
    public void selecting_the_book() throws Throwable {
    	
    	sb = new SearchBook(driver);
    	sb.book().click();
    	
    }

    @Then("^clicking on a add to cart button$")
    public void clicking_on_a_add_to_cart_button() throws Throwable {
    	
    	sb.clickaddtocart().click();
    	
    }

}