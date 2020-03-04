package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framessample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("https://www.toolsqa.com/iframe-practice-page");
			
		/* System.out.println(driver.findElements(By.tagName("frame"))); */
			
			WebElement sortable = driver.findElement(By.id("23275" ));
			
			driver.switchTo().frame(sortable);
			
			System.out.println("Hi1");

	}

}
