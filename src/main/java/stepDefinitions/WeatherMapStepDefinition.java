package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WeatherMapStepDefinition {

	@Given("^User is on the page https://openweathermap\\.org/$")
	public void user_is_on_the_page_https_openweathermap_org() throws Throwable {
	    System.out.println("on page mentioned");
	}

	@When("^Page is appropriately loaded$")
	public void page_is_appropriately_loaded() throws Throwable {
		System.out.println("page loaded");
	}

	@Then("^check city name input and search button is available$")
	public void check_city_name_input_and_search_button_is_available() throws Throwable {
		System.out.println("search button available");
	}

	@Then("^check sample information is london is dispalyed$")
	public void check_sample_information_is_london_is_dispalyed() throws Throwable {
		System.out.println("check complete");
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		System.out.println("browser closed");
	}
	
	
}
