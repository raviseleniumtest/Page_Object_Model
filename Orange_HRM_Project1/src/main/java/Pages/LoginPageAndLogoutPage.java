package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPageAndLogoutPage  {
	
	Properties prop;
	 WebDriver driver;
	 

		public void loadFileInputStream() throws IOException {
			FileInputStream file = new FileInputStream("D:\\softwarechanna\\Orange_HRM_Project1\\src\\main\\java\\UtilityFile\\com.properties");
			prop = new Properties();
			prop.load(file);
			
		}

	 
	 
	public LoginPageAndLogoutPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	
	By uN = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By pW = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By LooginB = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

	By logoutsign = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span");
    By logoutB = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");
	
    
	public void login() throws IOException {		
		driver.findElement(uN).sendKeys(prop.getProperty("userName"));
		driver.findElement(pW).sendKeys(prop.getProperty("password"));
		driver.findElement(LooginB).click();
	}
	
	public void logout() {
		driver.findElement(logoutsign).click();
		driver.findElement(logoutB).click();
		
	}

}
