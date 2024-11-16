package AlertsPack;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AlertsClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch33_11AM\\Selenium Softwares\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("C:\\My Personal\\Batches\\Selenium Elements\\Alert Message.html");
	    
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/button")).click();
        
        Thread.sleep(2000);
        
     Alert alt =    driver.switchTo().alert();
     
     //alt.getText()
     
     alt.accept(); //clicks on Yes/Ok
     
    // alt.dismiss(); //clicks on cancel
     
     
	  
	  
	   
	  
	   
	   
	   
	   
	   
	    
	    
	    
	
	}

}
