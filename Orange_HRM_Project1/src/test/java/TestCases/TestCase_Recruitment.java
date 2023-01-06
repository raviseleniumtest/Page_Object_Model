package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPageAndLogoutPage;
import Pages.RecruitmentPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_Recruitment {
	
	LoginPageAndLogoutPage lap;
	RecruitmentPage rp;
	WebDriver driver;

	@BeforeMethod
	
		public void OpenWebPage() throws Exception   {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			LoginPageAndLogoutPage lap = new LoginPageAndLogoutPage(driver);
			lap.loadFileInputStream();
			lap.login();
			
	}
	@Test
	public void addEmployee() throws Throwable  {
		RecruitmentPage rp = new RecruitmentPage(driver);
		rp.loadFileInputStream();
		rp.recruitmentDetails();

	}
}
