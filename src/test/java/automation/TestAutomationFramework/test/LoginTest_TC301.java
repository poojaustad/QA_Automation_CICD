package automation.TestAutomationFramework.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest_TC301 extends BaseTest {

	@Test(groups="regression")
	public void ValidLogin() throws InterruptedException {

		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		login.UserSignOn("abc", "123");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);


	}


}
