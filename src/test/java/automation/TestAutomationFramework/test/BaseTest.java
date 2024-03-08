package automation.TestAutomationFramework.test;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import automation.TestAutomationFramework.pageObjects.FlightBookingPage;
import automation.TestAutomationFramework.pageObjects.LoginPage;
import automation.TestAutomationFramework.pageObjects.Register;
import driverManager.DriverManagerType;
import driverManager.WebDrivers;
import resources.utility;

public class BaseTest {

	
	protected Register register;
	protected LoginPage login;
	protected FlightBookingPage flightBook;
	WebDriver driver;
	Properties properties;
	static String URL;
	
	WebDriverWait wait;

	@BeforeMethod
	public void setUp() {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		 driver = new ChromeDriver();
		String propertyPath = "/Selenium_Rogersoft/TestAutomationFramework/TestAutomationFramework/src/test/java/resources/Env.properties";

		properties =utility.loadProperties(propertyPath);
		URL = properties.getProperty("URL");
	
		
		
		 login = new LoginPage(driver); 
		 register = new Register(driver);
		 flightBook = new FlightBookingPage(driver);
		
		// WebDriverWait wait = new WebDriverWait(driver,30);
	
        driver.manage().window().maximize();
		 
		 		 
		/*
		 * try { driver = WebDrivers.getDriver(DriverManagerType.CHROME); 
		 * properties =utility.loadProperties(propertyPath); 
		 * URL = properties.getProperty("URL");
		 * LoginURL = properties.getProperty(URL_1);
		 * 
		 * login = new LoginPage(driver); 
		 * register = new Register(driver);
		 * 
		 * } catch (Exception e) { System.out.println(e.getMessage()); }
		 */
	}

	@AfterMethod
	public void destroyDriver() {
		driver.quit();
	}
}
