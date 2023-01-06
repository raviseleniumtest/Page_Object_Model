package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage  {
	  
	WebDriver driver;
	Properties prop;
	
	 public void loadFileInputStream() throws IOException {
			FileInputStream file = new FileInputStream("D:\\softwarechanna\\Orange_HRM_Project1\\src\\main\\java\\UtilityFile\\com.properties");
			prop = new Properties();
			prop.load(file);
			
	   }
	 
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver= driver;
 
	}
	 By forgotPassword = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");
	 By uN = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[1]/div/div[2]/input");
	 By resetPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]");
	
	
	 public void forgotYourPassword() {
		 driver.findElement(forgotPassword).click();
		 driver.findElement(uN).sendKeys(prop.getProperty("userNameFor"));
		 driver.findElement(resetPassword).click();
	 }

}
