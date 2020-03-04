package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class image {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("http://www.leafground.com/pages/Image.html");
			
			
			WebElement goodimage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div"));
			goodimage.click();
			
			
			WebElement brokenimage = driver.findElement(By.linkText("Am I Broken Image?"));
			
			String a = brokenimage.getAttribute("naturalwidth");
			
			if (a.equals("0"))
			{
				System.out.println("broken");
			}
	}

}
