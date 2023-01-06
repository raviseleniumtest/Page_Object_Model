package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPageAndLogoutPage;
import Pages.PIMPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_PIMPage{
	
	  PIMPage pp;
	  LoginPageAndLogoutPage lap;
     WebDriver driver;
	

	@BeforeMethod
	public void OpenWebPage() throws Exception   {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		LoginPageAndLogoutPage lap = new LoginPageAndLogoutPage(driver);
		lap.loadFileInputStream();
		lap.login();
		
   }
	@Test
	public void addEmployee() throws Throwable  {
		PIMPage pp = new PIMPage(driver);
		pp.loadFileInputStream();

		 pp.PIMData();

   }
}
