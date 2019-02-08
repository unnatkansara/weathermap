package pages;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Utilities;

public class HomePage{
	private WebDriver driver;
	
    private Map<String, String> data;
    
    private int timeout = 15;
    
    @FindBy(id = "q")
    @CacheLookup
    private WebElement searchCityInput;
    
    @FindBy(xpath = "//*[@id='searchform']/button")
    @CacheLookup
    private WebElement searchButton;
    
    @FindBy(id = "tab-chart")
    @CacheLookup
    private WebElement chart;
    
    @FindBy(id = "tab-daily")
    @CacheLookup
    private WebElement daily;
    
    @FindBy(id = "tab-hourly")
    @CacheLookup
    private WebElement hourly;
    
    @FindBy(id = "tab-main")
    @CacheLookup
    private WebElement main;

    @FindBy(id = "tab-map")
    @CacheLookup
    private WebElement map;
    
    @FindBy(css = "a[href='/about']")
    @CacheLookup
    private WebElement aboutCompany;
    
    @FindBy(className = "navbar-brand")
    @CacheLookup
    private WebElement logo;
    
    @FindBy(css = "#widget > div > div > div.widget__layout > div.widget__graphic > span > span > div.weather-forecast-hourly-graphic > h2")
    @CacheLookup
    private WebElement infoHeading;
    
	@FindBy(id = "jsnline")
    @CacheLookup
    private WebElement _0;

    @FindBy(css = "a.weather-widget__link")
    @CacheLookup
    private WebElement _0135151;

    @FindBy(css = "#undefined-sticky-wrapper div.navbar.navbar-dark.navbar-static-top div.container div.row div:nth-of-type(2) ul.nav.navbar-nav.navbar-right li:nth-of-type(6) a.nav__link.bg-hover-color")
    @CacheLookup
    private WebElement api;

    @FindBy(css = "a[href='//owm.io/beautiful_maps']")
    @CacheLookup
    private WebElement beautifulPlaces;

    @FindBy(id = "units_check")
    @CacheLookup
    private WebElement cf2;

    @FindBy(css = "-orange main.wrapper div:nth-of-type(4) div:nth-of-type(3) div:nth-of-type(2) div.col-sm-12 div:nth-of-type(4) div.services-item-desc p.text-muted a.btn.btn-orange")
    @CacheLookup
    private WebElement connect;

    @FindBy(css = "button.btn.search-cities__lnk")
    @CacheLookup
    private WebElement currentLocation;

    @FindBy(css = "a[href='/weathermap?basemap=satellite&cities=false&layer=precipitation&lat=30&lon=-20&zoom=3']")
    @CacheLookup
    private WebElement currentSatelliteMaps;

    @FindBy(css = "a[href='../current']")
    @CacheLookup
    private WebElement currentWeather;

    @FindBy(css = "a[href='../forecast5']")
    @CacheLookup
    private WebElement day3HourWeather5;

    @FindBy(css = "a[href='../forecast16']")
    @CacheLookup
    private WebElement dayDailyWeatherForecast16;

    @FindBy(css = "a[href='../examples']")
    @CacheLookup
    private WebElement examplesOfApiUse;

    @FindBy(css = "a[href='../api/weathermaps#examples']")
    @CacheLookup
    private WebElement examplesOfWeatherMapLayers;

    @FindBy(css = "a[href='../find?q=']")
    @CacheLookup
    private WebElement findYourCity;

    @FindBy(css = "-orange main.wrapper div:nth-of-type(4) div:nth-of-type(3) div:nth-of-type(1) div.row.owm-weathermap__items div:nth-of-type(1) div.portfolio-item div.owm-weathermap__title h3.primary-font a")
    @CacheLookup
    private WebElement forecastHistoricalWeatherMap;

    @FindBy(css = "a[href='/guide']")
    @CacheLookup
    private WebElement guide;

    @FindBy(id = "jsDebugHideAllButton")
    @CacheLookup
    private WebElement hideAll;

    @FindBy(id = "jsDebugHideSourceButton")
    @CacheLookup
    private WebElement hideDetails;

    @FindBy(css = "a[href='../history-bulk']")
    @CacheLookup
    private WebElement historyBulk;

    @FindBy(css = "a[href='../history']")
    @CacheLookup
    private WebElement hourlyHistoricalData;

    @FindBy(css = "a[href='../stations']")
    @CacheLookup
    private WebElement howToConnectYourWeatherStation;

    @FindBy(css = "-orange main.wrapper div:nth-of-type(4) div:nth-of-type(1) div:nth-of-type(2) div.text-center a.btn.btn-orange.owm-agro__btn")
    @CacheLookup
    private WebElement howToStart1;

    @FindBy(css = "a[href='../appid']")
    @CacheLookup
    private WebElement howToStart2;

    @FindBy(id = "tv")
    @CacheLookup
    private WebElement imagesrffnonoseparatorImageRequestVarNline0varNodes1;

    @FindBy(id = "tvarCode")
    @CacheLookup
    private WebElement imagesrffnonoseparatorImageRequestVarNline0varNodes2;

    @FindBy(id = "bodyCode")
    @CacheLookup
    private WebElement imagesrffnonoseparatorImageRequestVarNline0varNodes3;

    @FindBy(id = "jsCode")
    @CacheLookup
    private WebElement imagesrffnonoseparatorImageRequestVarNline0varNodes4;

    @FindBy(css = "a[href='mailto:info@openweathermap.org']")
    @CacheLookup
    private WebElement infoopenweathermapOrg;

    @FindBy(css = "-orange main.wrapper div:nth-of-type(4) div:nth-of-type(3) div:nth-of-type(1) div.row.owm-weathermap__items div:nth-of-type(3) div.portfolio-item div.owm-weathermap__title h3.primary-font a")
    @CacheLookup
    private WebElement interactiveCurrentWeatherMap;

    @FindBy(css = "a[href='../api/weathermaps#library']")
    @CacheLookup
    private WebElement librariesToConnectWeatherLayers;

    @FindBy(css = "a[href='../api/weathermaps#legend']")
    @CacheLookup
    private WebElement mapStylesLegend;

    @FindBy(css = "a.nav__link.dropdown-toggle.bg-hover-color")
    @CacheLookup
    private WebElement maps;

    @FindBy(css = "-orange main.wrapper div:nth-of-type(3) div.row div.row.services div.col-sm-12 div.services-item div.services-item-desc p.text-muted a.btn.btn-orange")
    @CacheLookup
    private WebElement moreWeatherInYourCity;

    @FindBy(css = "-orange main.wrapper div:nth-of-type(4) div:nth-of-type(2) div:nth-of-type(2) div.text-center a.btn.btn-orange.owm-agro__btn")
    @CacheLookup
    private WebElement moveToAgromonitoringCom;

    @FindBy(id = "jsDebugShowSourceButton")
    @CacheLookup
    private WebElement noTag;

    @FindBy(css = "-orange footer.footer-dark div.container div:nth-of-type(3) div.col-sm-12 p:nth-of-type(1) a:nth-of-type(4)")
    @CacheLookup
    private WebElement ourTeam;

    private final String pageLoadedText = "Weather";

    private final String pageUrl = "/";

    @FindBy(css = "a[href='/examples']")
    @CacheLookup
    private WebElement partners;

    @FindBy(css = "a[href='/price']")
    @CacheLookup
    private WebElement price;

    @FindBy(css = "a[href='../price']")
    @CacheLookup
    private WebElement pricelist;

    @FindBy(css = "#stick-footer-panel div.stick-footer-panel div.container div.row div.stick-footer-panel__container p.stick-footer-panel__description a")
    @CacheLookup
    private WebElement privacyPolicy;


    @FindBy(css = "a[href='http://openweathermap.org/examples#google1']")
    @CacheLookup
    private WebElement readMore;

    @FindBy(id = "q")
    @CacheLookup
    private WebElement search1;

    @FindBy(css = "button.btn.btn-orange")
    @CacheLookup
    private WebElement search2;

    @FindBy(css = "-orange div:nth-of-type(1) div.container div.row div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement signIn1;

    @FindBy(css = "#undefined-sticky-wrapper div.navbar.navbar-dark.navbar-static-top div.container div.row div:nth-of-type(2) ul.nav.navbar-nav.navbar-right li:nth-of-type(1) a.bg-hover-color")
    @CacheLookup
    private WebElement signIn2;

    @FindBy(css = "-orange div:nth-of-type(1) div.container div.row div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement signUp;


    @FindBy(css = "#undefined-sticky-wrapper div.navbar.navbar-dark.navbar-static-top div.container div.row div:nth-of-type(2) ul.nav.navbar-nav.navbar-right li:nth-of-type(9) a.nav__link.bg-hover-color")
    @CacheLookup
    private WebElement stations;

    @FindBy(css = "a[href='../price_subscribe']")
    @CacheLookup
    private WebElement subscribeToApis;

    @FindBy(css = "a.first-child")
    @CacheLookup
    private WebElement supportCenter;

    @FindBy(css = "-orange main.wrapper div:nth-of-type(4) div:nth-of-type(3) div:nth-of-type(2) div.col-sm-12 div:nth-of-type(5) div.alert.alert-info a.alert-link")
    @CacheLookup
    private WebElement supportCenter1;

    @FindBy(css = "-orange footer.footer-dark div.container div:nth-of-type(1) div:nth-of-type(2) div.content div:nth-of-type(1) a.alert-link")
    @CacheLookup
    private WebElement supportCenter2;

    @FindBy(id = "jsShowSourceButton")
    @CacheLookup
    private WebElement tagFound;

    @FindBy(css = "-orange footer.footer-dark div.container div:nth-of-type(1) div:nth-of-type(3) ul:nth-of-type(2) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement team;

    @FindBy(css = "a[href='https://openweather.co.uk/storage/app/media/Terms/Openweather_terms_and_conditions_of_sale.pdf']")
    @CacheLookup
    private WebElement termsAndConditionsOfSale;

    @FindBy(css = "button.navbar-toggle")
    @CacheLookup
    private WebElement toggleNavigation;

    @FindBy(css = "-orange main.wrapper div:nth-of-type(4) div:nth-of-type(3) div:nth-of-type(2) div.col-sm-12 div:nth-of-type(3) div.services-item-desc p.text-muted a.btn.btn-orange")
    @CacheLookup
    private WebElement tryFreeApis;

    @FindBy(css = "a[href='http://openweathermap.org/examples']")
    @CacheLookup
    private WebElement viewSolutions;

    @FindBy(css = "#undefined-sticky-wrapper div.navbar.navbar-dark.navbar-static-top div.container div.row div:nth-of-type(2) ul.nav.navbar-nav.navbar-right li:nth-of-type(3) a.nav__link.bg-hover-color")
    @CacheLookup
    private WebElement weather;

    @FindBy(css = "a[href='../api']")
    @CacheLookup
    private WebElement weatherApisForDevelopers;

    @FindBy(id = "nav-search")
    @CacheLookup
    private WebElement weatherInYourCity;

    @FindBy(css = "-orange main.wrapper div:nth-of-type(4) div:nth-of-type(3) div:nth-of-type(1) div.row.owm-weathermap__items div:nth-of-type(2) div.portfolio-item div.owm-weathermap__title h3.primary-font a")
    @CacheLookup
    private WebElement weatherMapLayers15;

    @FindBy(css = "#undefined-sticky-wrapper div.navbar.navbar-dark.navbar-static-top div.container div.row div:nth-of-type(2) ul.nav.navbar-nav.navbar-right li:nth-of-type(4) ul.dropdown-menu li:nth-of-type(1) a.bg-hover-color")
    @CacheLookup
    private WebElement weatherMaps1;

    @FindBy(css = "a[href='../weathermap']")
    @CacheLookup
    private WebElement weatherMaps2;

    @FindBy(css = "a[href='/technology']")
    @CacheLookup
    private WebElement weatherModel;

    @FindBy(css = "a[href='https://openweather.co.uk/storage/app/media/Terms/Openweather_website_terms_and_conditions_of_use.pdf']")
    @CacheLookup
    private WebElement websitesTermsAndConditionsOfUse;

    @FindBy(css = "a[href='/widgets-constructor']")
    @CacheLookup
    private WebElement widgets;

    @FindBy(css = "button.weather-widget__link")
    @CacheLookup
    private WebElement wrongData;

    @FindBy(css = "-orange main.wrapper div:nth-of-type(4) div:nth-of-type(1) div:nth-of-type(2) p:nth-of-type(1) a")
    @CacheLookup
    private WebElement wwwAgromonitoringCom1;

    @FindBy(css = "-orange main.wrapper div:nth-of-type(4) div:nth-of-type(1) div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement wwwAgromonitoringCom2;

    public HomePage() {
    	PageFactory.initElements(driver, this);
    }    

    public HomePage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public HomePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HomePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }
    
    public void navigateToHomePage(WebDriver driver){
    	driver.navigate().to("https://openweathermap.org/");
    }
    
    public WebElement getsearchButton(){
    	return searchButton;
    }
    
    public WebElement getsearchCityInput(){
    	return searchCityInput;
    }
    
    public WebElement getaboutCompany(){
    	return aboutCompany;
    }
    
    public WebElement getlogo(){
    	return logo;
    } 
    
    public WebElement getInfoHeading() {
		return infoHeading;
	}

    
    
    /**
     * Verify that the page loaded completely.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageLoaded() {
        (new WebDriverWait(this.driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Click on 51.51 0.13 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage click013Link5151() {
        _0135151.click();
        return this;
    }

    /**
     * Click on About Company Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAboutCompanyLink() {
        aboutCompany.click();
        return this;
    }

    /**
     * Click on Api Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickApiLink() {
        api.click();
        return this;
    }

    /**
     * Click on Beautiful Places Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBeautifulPlacesLink() {
        beautifulPlaces.click();
        return this;
    }

     /**
     * Click on 0 Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickButton0() {
        _0.click();
        return this;
    }

    /**
     * Click on Chart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickChartLink() {
        chart.click();
        return this;
    }

    /**
     * Click on Connect Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickConnectLink() {
        connect.click();
        return this;
    }

    /**
     * Click on Current Location Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCurrentLocationButton() {
        currentLocation.click();
        return this;
    }

    /**
     * Click on Current Satellite Maps Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCurrentSatelliteMapsLink() {
        currentSatelliteMaps.click();
        return this;
    }

    /**
     * Click on Current Weather Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCurrentWeatherLink() {
        currentWeather.click();
        return this;
    }

    /**
     * Click on Daily Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDailyLink() {
        daily.click();
        return this;
    }

    /**
     * Click on 5 Day 3 Hour Weather Forecast Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDay3HourWeatherLink5() {
        day3HourWeather5.click();
        return this;
    }

    /**
     * Click on 16 Day Daily Weather Forecast Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDayDailyWeatherForecastLink16() {
        dayDailyWeatherForecast16.click();
        return this;
    }

    /**
     * Click on Examples Of Api Use Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickExamplesOfApiUseLink() {
        examplesOfApiUse.click();
        return this;
    }

    /**
     * Click on Examples Of Weather Map Layers Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickExamplesOfWeatherMapLayersLink() {
        examplesOfWeatherMapLayers.click();
        return this;
    }

    /**
     * Click on Find Your City Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFindYourCityLink() {
        findYourCity.click();
        return this;
    }

    /**
     * Click on Forecast Historical Weather Map Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickForecastHistoricalWeatherMapLink() {
        forecastHistoricalWeatherMap.click();
        return this;
    }

    /**
     * Click on Guide Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickGuideLink() {
        guide.click();
        return this;
    }

    /**
     * Click on Hide All Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHideAllButton() {
        hideAll.click();
        return this;
    }

    /**
     * Click on Hide Details Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHideDetailsButton() {
        hideDetails.click();
        return this;
    }

    /**
     * Click on History Bulk Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHistoryBulkLink() {
        historyBulk.click();
        return this;
    }

    /**
     * Click on Hourly Historical Data Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHourlyHistoricalDataLink() {
        hourlyHistoricalData.click();
        return this;
    }

    /**
     * Click on Hourly Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHourlyLink() {
        hourly.click();
        return this;
    }

    /**
     * Click on How To Connect Your Weather Station Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHowToConnectYourWeatherStationLink() {
        howToConnectYourWeatherStation.click();
        return this;
    }

    /**
     * Click on How To Start Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHowToStart1Link() {
        howToStart1.click();
        return this;
    }

    /**
     * Click on How To Start Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHowToStart2Link() {
        howToStart2.click();
        return this;
    }

    /**
     * Click on Infoopenweathermap.org Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickInfoopenweathermapOrgLink() {
        infoopenweathermapOrg.click();
        return this;
    }

    /**
     * Click on Interactive Current Weather Map Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickInteractiveCurrentWeatherMapLink() {
        interactiveCurrentWeatherMap.click();
        return this;
    }

    /**
     * Click on Libraries To Connect Weather Layers Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLibrariesToConnectWeatherLayersLink() {
        librariesToConnectWeatherLayers.click();
        return this;
    }

    /**
     * Click on Main Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMainLink() {
        main.click();
        return this;
    }

    /**
     * Click on Map Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMapLink() {
        map.click();
        return this;
    }

    /**
     * Click on Map Styles Legend Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMapStylesLegendLink() {
        mapStylesLegend.click();
        return this;
    }

    /**
     * Click on Maps Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMapsLink() {
        maps.click();
        return this;
    }

    /**
     * Click on More Weather In Your City Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMoreWeatherInYourCityLink() {
        moreWeatherInYourCity.click();
        return this;
    }

    /**
     * Click on Move To Agromonitoring.com Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMoveToAgromonitoringComLink() {
        moveToAgromonitoringCom.click();
        return this;
    }

    /**
     * Click on No Tag Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickNoTagButton() {
        noTag.click();
        return this;
    }

    /**
     * Click on Our Team Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOurTeamLink() {
        ourTeam.click();
        return this;
    }

    /**
     * Click on Partners Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPartnersLink() {
        partners.click();
        return this;
    }

    /**
     * Click on Price Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPriceLink() {
        price.click();
        return this;
    }

    /**
     * Click on Pricelist Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPricelistLink() {
        pricelist.click();
        return this;
    }

    /**
     * Click on Privacy Policy. Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

       /**
     * Click on Read More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickReadMoreLink() {
        readMore.click();
        return this;
    }

    /**
     * Set default value to Search Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSearch1Button() {
        return clickSearch1Button(data.get("SEARCH"));
    }

    /**
     * Click on Search Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSearch1Button(String searchValue) {
        search1.sendKeys(searchValue);
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSearch2Button() {
        search2.click();
        return this;
    }

    /**
     * Click on Sign In Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSignIn1Link() {
        signIn1.click();
        return this;
    }

    /**
     * Click on Sign In Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSignIn2Link() {
        signIn2.click();
        return this;
    }

    /**
     * Click on Sign Up Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSignUpLink() {
        signUp.click();
        return this;
    }

 
    /**
     * Click on Stations Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickStationsLink() {
        stations.click();
        return this;
    }

    /**
     * Click on Subscribe To Apis Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSubscribeToApisLink() {
        subscribeToApis.click();
        return this;
    }

    /**
     * Click on Support Center Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupportCenter1Link() {
        supportCenter1.click();
        return this;
    }

    /**
     * Click on Support Center Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupportCenter2Link() {
        supportCenter2.click();
        return this;
    }

    /**
     * Click on Support Center Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupportCenterLink() {
        supportCenter.click();
        return this;
    }

    /**
     * Click on Tag Found Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTagFoundButton() {
        tagFound.click();
        return this;
    }

    /**
     * Click on Team Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTeamLink() {
        team.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Sale Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTermsAndConditionsOfSaleLink() {
        termsAndConditionsOfSale.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Try Free Apis Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTryFreeApisLink() {
        tryFreeApis.click();
        return this;
    }

    /**
     * Click on View Solutions Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickViewSolutionsLink() {
        viewSolutions.click();
        return this;
    }

    /**
     * Click on Weather Apis For Developers Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWeatherApisForDevelopersLink() {
        weatherApisForDevelopers.click();
        return this;
    }

    /**
     * Click on Weather In Your City Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWeatherInYourCityLink() {
        weatherInYourCity.click();
        return this;
    }

    /**
     * Click on Weather Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWeatherLink() {
        weather.click();
        return this;
    }

    /**
     * Click on 15 Weather Map Layers Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWeatherMapLayersLink15() {
        weatherMapLayers15.click();
        return this;
    }

    /**
     * Click on Weather Maps Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWeatherMaps1Link() {
        weatherMaps1.click();
        return this;
    }

    /**
     * Click on Weather Maps Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWeatherMaps2Link() {
        weatherMaps2.click();
        return this;
    }

    /**
     * Click on Weather Model Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWeatherModelLink() {
        weatherModel.click();
        return this;
    }

    /**
     * Click on Websites Terms And Conditions Of Use Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWebsitesTermsAndConditionsOfUseLink() {
        websitesTermsAndConditionsOfUse.click();
        return this;
    }

    /**
     * Click on Widgets Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWidgetsLink() {
        widgets.click();
        return this;
    }

    /**
     * Click on Wrong Data Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWrongDataButton() {
        wrongData.click();
        return this;
    }

    /**
     * Click on Www.agromonitoring.com Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWwwAgromonitoringCom1Link() {
        wwwAgromonitoringCom1.click();
        return this;
    }

    /**
     * Click on Www.agromonitoring.com Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWwwAgromonitoringCom2Link() {
        wwwAgromonitoringCom2.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the HomePage class instance.
     */
    public HomePage fill() {
        setCf1CheckboxField();
        setCf2CheckboxField();
        clickSearch1Button();
        setImagesrffnonoseparatorImageRequestVarNline0varNodes1TextareaField();
        setImagesrffnonoseparatorImageRequestVarNline0varNodes2TextareaField();
        setImagesrffnonoseparatorImageRequestVarNline0varNodes3TextareaField();
        setImagesrffnonoseparatorImageRequestVarNline0varNodes4TextareaField();
        return this;
    }


    /**
     * Set default value to Cf Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setCf1CheckboxField() {
        return setCf1CheckboxField(data.get("CF"));
    }

    /**
     * Set Cf Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setCf1CheckboxField(String cfValue) {
        searchCityInput.sendKeys(cfValue);
        return this;
    }

    /**
     * Set Cf Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setCf2CheckboxField() {
        if (!cf2.isSelected()) {
            cf2.click();
        }
        return this;
    }

    /**
     * Set default value to Imagesrffnonoseparator Image Request Var Nline0var Nodes Document Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setImagesrffnonoseparatorImageRequestVarNline0varNodes1TextareaField() {
        return setImagesrffnonoseparatorImageRequestVarNline0varNodes1TextareaField(data.get("IMAGESRFFNONOSEPARATOR_IMAGE_REQUEST_VAR_NLINE0VAR_NODES_1"));
    }

    /**
     * Set value to Imagesrffnonoseparator Image Request Var Nline0var Nodes Document Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setImagesrffnonoseparatorImageRequestVarNline0varNodes1TextareaField(String imagesrffnonoseparatorImageRequestVarNline0varNodes1Value) {
        imagesrffnonoseparatorImageRequestVarNline0varNodes1.sendKeys(imagesrffnonoseparatorImageRequestVarNline0varNodes1Value);
        return this;
    }

    /**
     * Set default value to Imagesrffnonoseparator Image Request Var Nline0var Nodes Document Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setImagesrffnonoseparatorImageRequestVarNline0varNodes2TextareaField() {
        return setImagesrffnonoseparatorImageRequestVarNline0varNodes2TextareaField(data.get("IMAGESRFFNONOSEPARATOR_IMAGE_REQUEST_VAR_NLINE0VAR_NODES_2"));
    }

    /**
     * Set value to Imagesrffnonoseparator Image Request Var Nline0var Nodes Document Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setImagesrffnonoseparatorImageRequestVarNline0varNodes2TextareaField(String imagesrffnonoseparatorImageRequestVarNline0varNodes2Value) {
        imagesrffnonoseparatorImageRequestVarNline0varNodes2.sendKeys(imagesrffnonoseparatorImageRequestVarNline0varNodes2Value);
        return this;
    }

    /**
     * Set default value to Imagesrffnonoseparator Image Request Var Nline0var Nodes Document Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setImagesrffnonoseparatorImageRequestVarNline0varNodes3TextareaField() {
        return setImagesrffnonoseparatorImageRequestVarNline0varNodes3TextareaField(data.get("IMAGESRFFNONOSEPARATOR_IMAGE_REQUEST_VAR_NLINE0VAR_NODES_3"));
    }

    /**
     * Set value to Imagesrffnonoseparator Image Request Var Nline0var Nodes Document Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setImagesrffnonoseparatorImageRequestVarNline0varNodes3TextareaField(String imagesrffnonoseparatorImageRequestVarNline0varNodes3Value) {
        imagesrffnonoseparatorImageRequestVarNline0varNodes3.sendKeys(imagesrffnonoseparatorImageRequestVarNline0varNodes3Value);
        return this;
    }

    /**
     * Set default value to Imagesrffnonoseparator Image Request Var Nline0var Nodes Document Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setImagesrffnonoseparatorImageRequestVarNline0varNodes4TextareaField() {
        return setImagesrffnonoseparatorImageRequestVarNline0varNodes4TextareaField(data.get("IMAGESRFFNONOSEPARATOR_IMAGE_REQUEST_VAR_NLINE0VAR_NODES_4"));
    }

    /**
     * Set value to Imagesrffnonoseparator Image Request Var Nline0var Nodes Document Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setImagesrffnonoseparatorImageRequestVarNline0varNodes4TextareaField(String imagesrffnonoseparatorImageRequestVarNline0varNodes4Value) {
        imagesrffnonoseparatorImageRequestVarNline0varNodes4.sendKeys(imagesrffnonoseparatorImageRequestVarNline0varNodes4Value);
        return this;
    }

 
    /**
     * Unset Cf Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetCf2CheckboxField() {
        if (cf2.isSelected()) {
            cf2.click();
        }
        return this;
    }

  
    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
	
	
}
