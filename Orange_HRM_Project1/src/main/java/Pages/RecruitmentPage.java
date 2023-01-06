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

public class RecruitmentPage {
	
	WebDriver driver;
	   public Properties prop;
		
	   public void loadFileInputStream() throws IOException {
			FileInputStream file = new FileInputStream("D:\\softwarechanna\\Orange_HRM_Project1\\src\\main\\java\\UtilityFile\\com.properties");
			prop = new Properties();
			prop.load(file);
	   }		
	   
 public RecruitmentPage(WebDriver driver) {
			this.driver= driver;
	 }
 
    By clickRecruitment = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a");
    By clickAdd = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    By fName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input");
    By mName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input");
    By lNmae = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input");
    By email = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");
    By contactNum = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input");
    By keyWords = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input");
    By resume = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/div/div[1]");
    By dateOfApp = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/div/div/input");
    By vacancy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[2]/i");
    
    public void recruitmentDetails() throws AWTException {
    	
    	Robot robot = new Robot();
    	
    	driver.findElement(clickRecruitment).click();
    	driver.findElement(clickAdd).click();
    	driver.findElement(fName).sendKeys(prop.getProperty("fName"));
    	driver.findElement(mName).sendKeys(prop.getProperty("mName"));
    	driver.findElement(lNmae).sendKeys(prop.getProperty("lName"));
    	driver.findElement(email).sendKeys(prop.getProperty("email"));
    	driver.findElement(contactNum).sendKeys(prop.getProperty("contactNum"));
    	driver.findElement(keyWords).sendKeys(prop.getProperty("keywords"));
    	driver.findElement(resume).click();
    	
    	
    	robot.setAutoDelay(2000);
		StringSelection imagepath = new StringSelection(prop.getProperty("resumepath"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagepath, null);
		
		robot.setAutoDelay(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
    	
    	driver.findElement(dateOfApp).sendKeys(prop.getProperty("dateofapp"));
    	driver.findElement(vacancy).click();
    	
    	robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
    }
    
    
}
