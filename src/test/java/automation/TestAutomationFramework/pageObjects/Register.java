package automation.TestAutomationFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Register extends BasePage {

	public Register(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstName;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastName;
	@FindBy(xpath="//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath="//input[@id='userName']")
	WebElement email;
	@FindBy(xpath="//input[@name='address1']")
	WebElement address;
	@FindBy(xpath ="//input[@name='city']")
	WebElement city;
	@FindBy(xpath ="//input[@name='state']")
	WebElement state ;
	@FindBy(xpath ="//input[@name='postalCode']")
	WebElement postcode;
	@FindBy(xpath="//select[@name='country']")
	WebElement country;
	@FindBy(xpath ="//input[@name='email']")
	WebElement userName;
	@FindBy(xpath ="//input[@name='password']")
	WebElement password;
	@FindBy(xpath ="//input[@name='confirmPassword']")
	WebElement confPassword;
	@FindBy(xpath ="//input[@name='submit']")
	WebElement btnSubmit;
	public void userRegistration(String firstNameD, String lastNameD, String emailId,String phoneNum,String countyvalue, String uname, String passwordtxt,String confirmPasswordTxt) {
	
	firstName.sendKeys(firstNameD);
	lastName.sendKeys(lastNameD);
	email.sendKeys(emailId);
	phone.sendKeys(phoneNum);
	Select select = new Select(country);
	select.selectByValue(countyvalue);
	userName.sendKeys(uname);
	password.sendKeys(passwordtxt);
	confPassword.sendKeys(confirmPasswordTxt);
	btnSubmit.click();
	}
}
