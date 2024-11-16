package CheckBoxPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch33_11AM\\Selenium Softwares\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("C:\\My Personal\\Batches\\Selenium Elements\\Country Check box.html");
	 
	   driver.findElement(By.xpath("/html/body/form/input[1]")).click();
	   driver.findElement(By.xpath("/html/body/form/input[3]")).click();
	   driver.findElement(By.xpath("/html/body/form/input[4]")).click();
	  
	  
	  
	   
	  
	   
	   
	   
	   
	   
	    
	    
	    
	
	}

}
