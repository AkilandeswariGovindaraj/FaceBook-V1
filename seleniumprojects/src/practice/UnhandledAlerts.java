package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement Clickbutton = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		
		Clickbutton.click();
		
		WebElement Clickbutton1 = driver.findElement(By.xpath("//button[@onclick1='normalAlert()']"));
		
	}

}
