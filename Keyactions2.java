package KeyBoardactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Keyactions2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch33_11AM\\Selenium Softwares\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    
      driver.findElement(By.id("APjFqb")).sendKeys("Data Types in Java");
	 
	   Actions A = new Actions(driver);
	   
	   Thread.sleep(2000);
	   A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
	              
       Thread.sleep(2000);
       
       A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
       
       Thread.sleep(2000);
       
       A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
       Thread.sleep(2000);
       
       A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
       Thread.sleep(2000);
       
       A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
       Thread.sleep(2000);
       
       A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
       
       Thread.sleep(2000);
       
       A.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
       
       Thread.sleep(2000);
       
       A.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
   

	   
	   
	  
	   

	  
	  
	  
	   
	  
	   
	   
	   
	   
	   
	    
	    
	    
	
	}

}
