package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch33_11AM\\Selenium Softwares\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	    
    
	   driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	   driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	   
	   driver.findElement(By.name("Submit")).click();
	   
	   
	   driver.switchTo().frame(driver.findElement(By.id("rightMenu"))); //moved to frame based on WebElement
	   
	WebElement dd =    driver.findElement(By.name("loc_code"));
	 List<WebElement>  ddv =  dd.findElements(By.tagName("option"));
	 
	 System.out.println("The Total Elements are : " +ddv.size());
	   
	   
	   
	   
	   
	  
	   
	   
	   
	   
	   
	    
	    
	    
	
	}

}