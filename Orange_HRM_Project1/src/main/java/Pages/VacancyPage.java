package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VacancyPage {
	
	WebDriver driver;
	   public Properties prop;
		
	   public void loadFileInputStream() throws IOException {
			FileInputStream file = new FileInputStream("D:\\softwarechanna\\Orange_HRM_Project1\\src\\main\\java\\UtilityFile\\com.properties");
			prop = new Properties();
			prop.load(file);
	   }		
	   
public VacancyPage(WebDriver driver) {
			this.driver= driver;
	 }

       By clickRecruitment = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a");
       By clickvacancy = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");
       By clickAdd = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
       By vacancyName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input");
       By description = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div[2]/textarea");
       By hiringManager = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[1]/div/div[2]/div/div/input");
       By noOfVacncies = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input");
       By jobTitle = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]");
       By saveButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/button[2]");
       
       public void vacancyDetails() throws AWTException {
    	   
    	   Robot robot  = new Robot();
    	   
    	   driver.findElement(clickRecruitment).click();
    	   driver.findElement(clickvacancy).click();
    	   driver.findElement(clickAdd).click();
    	   driver.findElement(vacancyName).sendKeys(prop.getProperty("vName"));
    	   driver.findElement(description).sendKeys(prop.getProperty("description"));
    	   driver.findElement(hiringManager).sendKeys(prop.getProperty("hiringManager"));
    	   driver.findElement(noOfVacncies).sendKeys(prop.getProperty("noOfVacancy"));
    	   driver.findElement(jobTitle).click();
    	   
    	   
    	   robot.setAutoDelay(2000);
    	   
   		robot.keyPress(KeyEvent.VK_Q);
   		robot.keyRelease(KeyEvent.VK_Q);
   		robot.keyPress(KeyEvent.VK_ENTER);
   		robot.keyRelease(KeyEvent.VK_ENTER);
   		
   		driver.findElement(saveButton).click();
		
   		

    	   }

}
