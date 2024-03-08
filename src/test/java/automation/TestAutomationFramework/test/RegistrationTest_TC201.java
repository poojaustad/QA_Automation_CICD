package automation.TestAutomationFramework.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationTest_TC201 extends BaseTest {

	@DataProvider(name = "testData")
	public Object[][] dataMethod() {
		return new Object[][] { 
			{ "Pooja", "Lakshmi", "854721", "Pooja@test", "INDIA", "pooj", "test1234", "test1234" },
			{ "Prajeesh", "KP", "prajee@test", "85746", "INDIA", "prajee", "test456", "test456" } };
	}

	@Test(dataProvider = "testData") // what if I want to add proiority too??
	public void userRegistration(String name, String lname, String email, String mob, String contry, String uname,
			String pwd, String cpwd) throws InterruptedException {
		driver.get(URL);
		Thread.sleep(3000);
		register.userRegistration(name, lname, email, mob, contry, uname, pwd, cpwd);
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(false, "failed");
		
	}
}
