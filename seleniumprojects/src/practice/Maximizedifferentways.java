package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximizedifferentways {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(cr);
		/*
		 * Dimension d = new Dimension(1388,780); driver.manage().window().setSize(d);
		 */
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("http://www.google.com");
			WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("A");
		
	}

}
