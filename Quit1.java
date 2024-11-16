package CloseandQuit;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Quit1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch33_11AM\\Selenium Softwares\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	    
    
	   driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	   driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	   
	   driver.findElement(By.name("Submit")).click();
	   
	 System.out.println("Before Clicking on Help--> Support " +driver.getTitle());  
	   
	  
	   Thread.sleep(2000);
	   
	   Actions A = new Actions(driver);
	   
	   A.moveToElement(driver.findElement(By.id("help"))).perform();
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//*[@id=\"help\"]/ul/li[2]/a/span")).click();
	   
	
	
	Set<String> allwins =    driver.getWindowHandles();
	
	System.out.println("The Total windows opened are : " +allwins.size());
	
	ArrayList<String> orderwin = new ArrayList<String>(allwins);
	
	driver.switchTo().window(orderwin.get(1));  //child window
	
System.out.println("After Code implementation : " +driver.getTitle());  
	   
Thread.sleep(2000);

driver.switchTo().window(orderwin.get(0));  //parent window

Thread.sleep(2000);

driver.switchTo().window(orderwin.get(1));  //child window
	   

Thread.sleep(2000);

driver.switchTo().window(orderwin.get(0));  //parent window

Thread.sleep(2000);

driver.quit();  //closes all windows
	   
	   
	  
	   
	   
	   
	   
	   
	    
	    
	    
	
	}

}
