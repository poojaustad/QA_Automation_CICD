package automation.TestAutomationFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class FlightBookingPage extends BasePage {

	public FlightBookingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//input[@value='oneway']")
	WebElement onewayRadioBtn;
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement Arriv;	
	@FindBy(name = "passCount")
	WebElement passCount;
	@FindBy(name="fromMonth")
	WebElement month;
	@FindBy(name="fromDay")
	WebElement fromDay;
	@FindBy(name="toPort")
	WebElement Dest;
	@FindBy(name="toMonth")
	WebElement toMonth;
	@FindBy(name="toDay")
	WebElement toDay;
	@FindBy(xpath="//input[@value='Business']")
	WebElement businessBtn;
	@FindBy(xpath="//img[@src='images/home.gif']")
	WebElement flightTxt;
	@FindBy(linkText="Flights")
	WebElement flights;
		
	public void Flight_Oneway_Business_Booking(String numberOfPassengers, String arrival, String frommon,String fromday, String Desti) throws InterruptedException {

		flights.click();
		Thread.sleep(5000);
		onewayRadioBtn.click();
		Select spass = new Select(passCount);
		spass.selectByValue(numberOfPassengers);
		Select sArriv = new Select(Arriv);
		sArriv.selectByValue(arrival);
		Select sfrommonth = new Select(month);
		sfrommonth.selectByValue(frommon);
		Select sfromDay = new Select(fromDay);
		sfromDay.selectByValue(fromday);
		Select sdest = new Select(Dest);
		sdest.selectByValue(Desti);
		SoftAssert softassert= new SoftAssert();
		Boolean state= ! toMonth.isEnabled();
		businessBtn.click();
		softassert.assertTrue(state);
		softassert.assertAll();
	}

}
