package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class refreshfunction {

	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("http://www.google.com");
			WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("A");
		
		
		driver.get(driver.getCurrentUrl());
		
		driver.navigate().to("http://www.google.com");
		WebElement search2 = driver.findElement(By.name("q"));
	search2.sendKeys("B");
	driver.navigate().refresh();
	
	driver.get("http://www.google.com");
	WebElement search3 = driver.findElement(By.name("q"));
search3.sendKeys("C");
Robot robo = new Robot();
robo.keyPress(KeyEvent.VK_F5);
robo.keyRelease(KeyEvent.VK_F5);


driver.get("http://www.google.com");
WebElement search4 = driver.findElement(By.name("q"));
search4.sendKeys("C");

JavascriptExecutor je = (JavascriptExecutor) driver;
je.executeScript("location.reload()");






		
	}

}
