package practice;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SBI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
			driver.get("https://www.onlinesbi.com");
			
			
		
		
			System.out.println("Hi1");
			
			WebElement SBIAnywhere = driver.findElement(By.linkText("SB Anywhere"));
	
			
			System.out.println("hi10");
		
		  Actions act = new Actions(driver); 
		  act.moveToElement(SBIAnywhere).perform();
		
		  System.out.println("hi16");
		
	 List<WebElement> lis = driver.findElements(By.xpath("//ul[@class ='dropdown-menu sm-nowrap']/li"));
		  System.out.println("hi12");
		 
		for(WebElement wb : lis)
			
		 { if(wb.getText().equals("SBA Corporate"))
		 
		 
		 { 
			 
			 wb.click();
		 }
	
		
		 }
			
			
	}



}