package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Utilities {
	public static WebDriver driver;
	
	public void navigateToUrl(String url){
		driver.navigate().to(url);
	}
	
	public void setImplicitWait(int waitTimeInSeconds){
		driver.manage().timeouts().implicitlyWait(waitTimeInSeconds, TimeUnit.SECONDS);
	}
	
	public void setExplicitWaitByVisibility(int waitTimeInSeconds){
		
	}
	
	
	
}
