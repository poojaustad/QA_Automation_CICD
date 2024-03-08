package automation.TestAutomationFramework.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest_TC302 extends BaseTest {


	@Test(groups="regression")
	public void InvalidLogin() throws InterruptedException{

		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		login.UserSignOn("ab3", "123");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

}
