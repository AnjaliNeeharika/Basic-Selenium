package MouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch33_11AM\\Selenium Softwares\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	    
    
	   driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	   driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	   
	   driver.findElement(By.name("Submit")).click();
	   Thread.sleep(2000);
	   
	   
	   Actions A = new Actions(driver);
	   
	   A.moveToElement( driver.findElement(By.id("report"))).perform();
	   

	  
	  
	  
	   
	  
	   
	   
	   
	   
	   
	    
	    
	    
	
	}

}
