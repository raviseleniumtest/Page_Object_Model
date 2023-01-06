package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPageAndLogoutPage;
import Pages.MyInfoPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_MyInfoPage {

	 LoginPageAndLogoutPage lap;
     WebDriver driver;
     MyInfoPage mip;
	
	
	
	@BeforeMethod
	public void OpenWebPage() throws IOException  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		LoginPageAndLogoutPage lap = new LoginPageAndLogoutPage(driver);
		lap.loadFileInputStream();
		lap.login();
    }
	
	@Test
	public void inputMyInfoDetails() throws Throwable {
		MyInfoPage mip = new MyInfoPage(driver);
		mip.loadFileInputStream();
		mip.myInFoDetails();
	}
}
