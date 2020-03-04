package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/tooltip.html");
	
			Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(10) ).ignoring(NoSuchElementException.class);
			
				WebElement wl = wait1.until(new Function<WebDriver,WebElement>()
						{
					public WebElement apply(WebDriver driver)
					{
						return driver.findElement(By.xpath("jhjkh"));
						
					}
						}
		
		String s = ttip.getAttribute("title");
		System.out.println(s);
		driver.close();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
