package automation.TestAutomationFramework.test;

import org.testng.annotations.Test;

public class FlightBookingTest_TC101 extends BaseTest{
  @Test
  public void OneWayBusinessClassFlightBooking() throws InterruptedException {
	  
	  driver.get(URL);
	  flightBook.Flight_Oneway_Business_Booking("2","Paris","8","20", "Sydney");
  }
}
