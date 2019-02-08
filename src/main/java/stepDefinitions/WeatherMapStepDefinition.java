package stepDefinitions;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import utility.Utilities;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WeatherMapStepDefinition extends Utilities{

	public WebDriver driver=Utilities.loadConfig();
	public HomePage homepage=new HomePage(driver);
	
	
	@Given("^User is on the page https://openweathermap\\.org/$")
	public void user_is_on_the_page_https_openweathermap_org() throws Throwable {
		homepage.navigateToHomePage(driver);
	}

	@When("^Page is appropriately loaded$")
	public void page_is_appropriately_loaded() throws Throwable {
		Assert.assertTrue(homepage.getsearchCityInput().isDisplayed());
	}

	@Then("^check city name input and search button is available$")
	public void check_city_name_input_and_search_button_is_available() throws Throwable {
		Assert.assertTrue(homepage.getsearchCityInput().isDisplayed());
		Assert.assertTrue(homepage.getsearchButton().isDisplayed());
	}

	@Then("^check sample information is london is dispalyed$")
	public void check_sample_information_is_london_is_dispalyed() throws Throwable {
		Assert.assertNotNull(homepage.getInfoHeading().getText().contains("Weather and forecasts in London"));
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
	
	
}
