package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Window.html");
		String parent=  driver.getWindowHandle();
		System.out.println(parent);
		
		WebElement button1 = driver.findElement(By.id("home"));
		 button1.click();
		 
		
		
		Set<String> s1 = driver.getWindowHandles();
		
		for (String s : s1) {
			
			
			driver.switchTo().window(s);
			
		}
			System.out.println("hi");
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			WebElement editbutton = driver.findElement(By.xpath("//img[@src='images/edit.png']"));
			editbutton.click();
		
		
		 
		
		

	}

}

	