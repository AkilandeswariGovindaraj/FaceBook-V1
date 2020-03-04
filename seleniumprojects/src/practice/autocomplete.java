package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("http://www.google.com");
			WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("A");
		    
			
			
		List<WebElement> autolist = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		for(WebElement we : autolist)
		{
			if(we.getText().equals("amazon"))
			{
					
					we.click();
			
			
		}
			else
				System.out.println("Not present");
	}

}}
