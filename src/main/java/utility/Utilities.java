package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
	public static WebDriver loadConfig(){
		try {
			Properties properties=new Properties();
			InputStream input = null;
			input = new FileInputStream("D:\\gitAutomation\\weathermap\\src\\main\\java\\resources\\config.properties");
			properties.load(input);
			
			//initialize Driver Name
			initializeBrowserDriver(properties.getProperty("browser"),properties.getProperty("driverpath"));
			
		} 
		catch(FileNotFoundException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	
	public static void initializeBrowserDriver(String driverName,String driverPath){
		switch(driverName.toLowerCase()){
			case "chrome":
				File file = new File(driverPath);
			    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			    driver = new ChromeDriver();
				break;
			case "firefox":
				break;
		}
		
		driver.manage().window().maximize();
		
	}
	
	
	
}
