package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {
    
	   WebDriver driver;
	   public Properties prop;
	   
		
	   public void loadFileInputStream() throws IOException, Throwable {
		   
			FileInputStream file = new FileInputStream("D:\\softwarechanna\\Orange_HRM_Project1\\src\\main\\java\\UtilityFile\\com.properties");
			prop = new Properties();
			prop.load(file);
	   }		
	   
     public PIMPage(WebDriver driver) {
			this.driver= driver;
	 }
  
		By pim = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
		By add = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
		By FirstName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input");
		By middleName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input");
		By lastName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input");
		By employeeId = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");
		By createLoginDetails = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span");
		By FileImage = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i");
		By uN = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");
		By pW = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input");
		By confirmPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");
		By saveButton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
		
		public  void PIMData() throws  Exception {
			
			Robot robot = new Robot();
		
			
			driver.findElement(pim).click();
			driver.findElement(add).click();
			Thread.sleep(5000);
			driver.findElement(FirstName).sendKeys(prop.getProperty("firstName"));
			driver.findElement(middleName).sendKeys(prop.getProperty("middleName"));
			driver.findElement(lastName).sendKeys(prop.getProperty("lastName"));
			driver.findElement(employeeId).sendKeys(prop.getProperty("employeeId"));
			driver.findElement(createLoginDetails).click();
			driver.findElement(FileImage).click();
			
			robot.setAutoDelay(2000);
			
			StringSelection imagepath = new StringSelection(prop.getProperty("imagepath"));
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagepath, null);
			
			robot.setAutoDelay(2000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(2000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(uN).sendKeys(prop.getProperty("uN"));
			driver.findElement(pW).sendKeys(prop.getProperty("pW"));
			driver.findElement(confirmPassword).sendKeys(prop.getProperty("confirmPassword"));
			driver.findElement(saveButton).click();
      
		}
}
