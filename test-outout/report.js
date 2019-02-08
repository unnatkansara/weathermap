$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/weathermap/weathermap/src/main/java/Features/weathermapFeatures.feature");
formatter.feature({
  "line": 1,
  "name": "To check weathermap site is working appropriately",
  "description": "",
  "id": "to-check-weathermap-site-is-working-appropriately",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "E2E test to check all important information displayed on landing page",
  "description": "",
  "id": "to-check-weathermap-site-is-working-appropriately;e2e-test-to-check-all-important-information-displayed-on-landing-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on the page https://openweathermap.org/",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Page is appropriately loaded",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "check city name input and search button is available",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "check sample information is london is dispalyed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "WeatherMapStepDefinition.user_is_on_the_page_https_openweathermap_org()"
});
formatter.result({
  "duration": 60842891145,
  "status": "passed"
});
formatter.match({
  "location": "WeatherMapStepDefinition.page_is_appropriately_loaded()"
});
formatter.result({
  "duration": 39544669389,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.isDisplayed(Unknown Source)\r\n\tat stepDefinitions.WeatherMapStepDefinition.page_is_appropriately_loaded(WeatherMapStepDefinition.java:27)\r\n\tat ✽.When Page is appropriately loaded(D:/weathermap/weathermap/src/main/java/Features/weathermapFeatures.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WeatherMapStepDefinition.check_city_name_input_and_search_button_is_available()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WeatherMapStepDefinition.check_sample_information_is_london_is_dispalyed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WeatherMapStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});