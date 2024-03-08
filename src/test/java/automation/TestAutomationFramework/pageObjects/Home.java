package automation.TestAutomationFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {

	public Home(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "firstName")
	WebElement fName;
	@FindBy(name = "lastName")
	WebElement lName;
	@FindBy(name = "phone")
	WebElement phone;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "confirmPassword")
	WebElement confPassword;
	@FindBy(name = "submit")
	WebElement btnSubmit;

	public void enterwithValidDetails(String firstName, String lastName, String phoneNum, String passwordtxt,
			String confirmPasswordTxt) {
		fName.sendKeys(firstName);
		lName.sendKeys(lastName);
		phone.sendKeys(phoneNum);
		password.sendKeys(passwordtxt);
		confPassword.sendKeys(confirmPasswordTxt);
		btnSubmit.click();
	}

}
