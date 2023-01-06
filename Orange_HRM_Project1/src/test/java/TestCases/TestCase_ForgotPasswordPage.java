package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ForgotPasswordPage;
import Pages.LoginPageAndLogoutPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_ForgotPasswordPage  {
	
	ForgotPasswordPage fpp;
	WebDriver driver;

	@BeforeMethod
	public void OpenWebPage() throws IOException   {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
	}
	
	@Test
	public void ForgotPassword() throws Throwable {
		ForgotPasswordPage fpp = new ForgotPasswordPage(driver);
		fpp.loadFileInputStream();
		fpp.forgotYourPassword();
		
	}
	

}
