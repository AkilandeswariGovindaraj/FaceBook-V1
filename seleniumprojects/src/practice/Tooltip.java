package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tooltip {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/tooltip.html");
		WebDriverWait wait = new  WebDriverWait(driver,20);
				
				
		WebElement ttip= wait.until(  ExpectedConditions.elementToBeClickable(By.id("age")));
		String s = ttip.getAttribute("title");
		System.out.println(s);
		driver.close();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}

}
