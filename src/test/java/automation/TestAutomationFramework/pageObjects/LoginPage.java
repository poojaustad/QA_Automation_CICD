package automation.TestAutomationFramework.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//input[@name='userName']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitBtn;
	@FindBy(className = "mouseOut")
	WebElement signoff;
	@FindBy(xpath = "//h3[text()=\'Login Successfully\']")
	WebElement successMsg;
	@FindBy(css = "tbody tr td span")
	WebElement errorMsg;
	@FindBy(linkText = "SIGN-ON")
	WebElement signOn;
	
	public void UserSignOn(String userid, String pwd) throws InterruptedException {

		signOn.click();
		Thread.sleep(5000);
		username.sendKeys(userid);
		password.sendKeys(pwd);
		submitBtn.click();
		String successtxt = successMsg.getText();
		String errorTxt =errorMsg.getText();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertTrue(successtxt.equalsIgnoreCase("Login Successfully"), "Error on Login");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		signoff.click();

	}

}
