package CheckListPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListClass2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\My Personal\\Batches\\Batch33_11AM\\Selenium Softwares\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("C:\\My Personal\\Batches\\Selenium Elements\\Country Name.Htm");
	 
	   
	  WebElement cl = driver.findElement(By.id("CheckList"));
	  
	 List<WebElement> tc =   cl.findElements(By.tagName("option"));
	 
	 System.out.println("The Total Countries are :  " +tc.size());
	  
	  Select S = new Select(cl);
	  
	  S.selectByIndex(23);
	  S.selectByIndex(73);
	  S.selectByVisibleText(" Sri Lanka");
	  S.selectByVisibleText(" Sweden");
	  
	  
	  
	   
	  
	   
	   
	   
	   
	   
	    
	    
	    
	
	}

}
