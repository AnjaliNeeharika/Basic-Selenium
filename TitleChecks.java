package BrowserPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleChecks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch33_11AM\\Selenium Softwares\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	    
	String hometitle =     driver.getTitle();
	
	System.out.println("The Home Page title is : " +hometitle);
	    
	   driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	   driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	   
	   driver.findElement(By.name("Submit")).click();
	   
	 String afterlogin =   driver.getTitle();
	 
	 System.out.println("The After login title is : " +afterlogin);
	   
	   
	   
	   
	    
	    
	    
	
	}

}
