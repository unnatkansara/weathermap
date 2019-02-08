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
  "duration": 96587361,
  "status": "passed"
});
formatter.match({
  "location": "WeatherMapStepDefinition.page_is_appropriately_loaded()"
});
formatter.result({
  "duration": 58053,
  "status": "passed"
});
formatter.match({
  "location": "WeatherMapStepDefinition.check_city_name_input_and_search_button_is_available()"
});
formatter.result({
  "duration": 52921,
  "status": "passed"
});
formatter.match({
  "location": "WeatherMapStepDefinition.check_sample_information_is_london_is_dispalyed()"
});
formatter.result({
  "duration": 55487,
  "status": "passed"
});
formatter.match({
  "location": "WeatherMapStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 57090,
  "status": "passed"
});
});