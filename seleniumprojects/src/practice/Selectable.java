package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectable {

	public static void main(String[] args)
	
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/selectable.html");
	
				
				
		List<WebElement> sel = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		
		int  n = sel.size();
		System.out.println(n);
		
	Actions act = new Actions(driver);
		
		act.clickAndHold(sel.get(0)).clickAndHold(sel.get(1)).clickAndHold(sel.get(2)).build().perform();
		
		driver.quit();
	}}


