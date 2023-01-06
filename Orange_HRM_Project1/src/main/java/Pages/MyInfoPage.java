package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MyInfoPage {
	
	WebDriver driver;
	   public Properties prop;
		
	   public void loadFileInputStream() throws IOException {
			FileInputStream file = new FileInputStream("D:\\softwarechanna\\Orange_HRM_Project1\\src\\main\\java\\UtilityFile\\com.properties");
			prop = new Properties();
			prop.load(file);
	   }		
	   
    public MyInfoPage(WebDriver driver) {
			this.driver= driver;
	 }
  
    By myInfo = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span");
    //personal Details

    By eName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input");
     By mName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input");
     By lName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input");
     By nName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input");
     By saveButton = By .xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button");
     By nationlity = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i");
     
     By contactDetails = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a");
     
     By street1 = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input");
     By street2 = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input");
     By city = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input");
     By state = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input");
     By postalCode = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input");




     public void  myInFoDetails() throws Throwable {
    	 
    	 Robot robot = new Robot();
    	 
    	 driver.findElement(myInfo).click();
    	 driver.findElement(eName).sendKeys(prop.getProperty("employeeName"));
    	 driver.findElement(mName).sendKeys(prop.getProperty("middleName"));
    	 driver.findElement(lName).sendKeys(prop.getProperty("lastName"));
    	 driver.findElement(nName).sendKeys(prop.getProperty("nickName"));
    	 driver.findElement(saveButton).click();
    	 driver.findElement(nationlity).click();
    	 
    	 robot.setAutoDelay(1000);
 		robot.keyPress(KeyEvent.VK_A);
 		robot.keyRelease(KeyEvent.VK_A);
 		robot.setAutoDelay(1000);
 		robot.keyPress(KeyEvent.VK_ESCAPE);
 		robot.keyRelease(KeyEvent.VK_ESCAPE);
 		
    	 
    	 driver.findElement(contactDetails).click();
    	 driver.findElement(street1).sendKeys(prop.getProperty("street1"));
    	 driver.findElement(street2).sendKeys(prop.getProperty("street2"));
    	 driver.findElement(city).sendKeys(prop.getProperty("city"));
    	 driver.findElement(state).sendKeys(prop.getProperty("state"));
    	 driver.findElement(postalCode).sendKeys(prop.getProperty("pCode"));
    	 
    	 
    	 
    	 

    	 
    	 
    	 
    	 

    	 
     }
     
     
}
