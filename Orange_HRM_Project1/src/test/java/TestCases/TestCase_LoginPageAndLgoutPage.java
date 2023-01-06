package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPageAndLogoutPage;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestCase_LoginPageAndLgoutPage {
	
	  LoginPageAndLogoutPage lap;
       WebDriver driver;

	@BeforeMethod
	public void OpenWebPage()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void ValidateLogin() throws IOException {	
		LoginPageAndLogoutPage lap = new LoginPageAndLogoutPage(driver);
		lap.loadFileInputStream();
		lap.login();
		lap.logout();
		
		}
}
