package automation.TestAutomationFramework.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest_TC202 extends BaseTest{
	
	

	@Test
public void registerUser_InvalidCase() {
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		register.userRegistration("Aravind", "Surendran", "arv@test.com","123456789","ITALY","Aravinds", "Test", "Test@123");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
}
	
	

}
