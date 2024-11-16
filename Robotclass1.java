package RobotPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass1 {

	
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch33_11AM\\Selenium Softwares\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		    
	    
		   driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		   driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		   driver.findElement(By.name("Submit")).click();
		   Thread.sleep(2000);
		   
		   
		   Actions A = new Actions(driver);
		   
		   A.moveToElement( driver.findElement(By.id("pim"))).perform();
		   
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
	       
	       Thread.sleep(2000);
	       driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
	       driver.findElement(By.name("txtEmployeeId")).clear();
	       Thread.sleep(2000);
	       driver.findElement(By.name("txtEmployeeId")).sendKeys("229900");
	       driver.findElement(By.name("txtEmpLastName")).sendKeys("my final");
	       driver.findElement(By.name("txtEmpFirstName")).sendKeys("names");
	       driver.findElement(By.name("txtEmpMiddleName")).sendKeys("ink");
	       driver.findElement(By.name("txtEmpNickName")).sendKeys("mango");
	       Thread.sleep(2000);
	       
	       A.moveToElement(driver.findElement(By.name("photofile"))).click().perform();
	       
	       Thread.sleep(2000);
	       
	       StringSelection s = new StringSelection("C:\\My Personal\\Batches\\Batch37_10AM\\Images\\STLC.jpg");

	       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);   //copied the file
	       
	       
		   Robot R = new Robot();
		   
		   R.keyPress(KeyEvent.VK_CONTROL);
		   R.keyPress(KeyEvent.VK_V);
		   
		   R.keyRelease(KeyEvent.VK_CONTROL);
		   R.keyRelease(KeyEvent.VK_V);
		   
		   Thread.sleep(2000);
		   
		   R.keyPress(KeyEvent.VK_ENTER);
		   R.keyRelease(KeyEvent.VK_ENTER);
		   
		   
		   
		   
		   
		
		
		}

}
