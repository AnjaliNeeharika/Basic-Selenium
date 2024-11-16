package MouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragandDropClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch33_11AM\\Selenium Softwares\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	      Thread.sleep(2000);
	   
	   
	   Actions A = new Actions(driver);
	   
	 WebElement src = driver.findElement(By.id("draggable"));
	 WebElement tgt = driver.findElement(By.id("droppable"));
	 
	 A.dragAndDrop(src, tgt).perform();
	 
	 
	   

	  
	  
	  
	   
	  
	   
	   
	   
	   
	   
	    
	    
	    
	
	}

}
