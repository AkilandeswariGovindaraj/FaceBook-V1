package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("http://www.leafground.com/pages/upload.html");
			
			Thread.sleep(4000);
			WebElement uploadbutton = driver.findElement(By.xpath("//*[@id=\"mydiv\"]/input"));
			uploadbutton.click();
			
			System.out.println("hi1");
			
		/*
		 * String file =
		 * "C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\testdata1.xlsx";
		 * 
		 * StringSelection selection = new StringSelection(file);
		 * System.out.println("hi2");
		 * 
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,
		 * null); System.out.println("hi3");
		 * 
		 * Robot robo = new Robot();
		 * 
		 * robo.keyPress(KeyEvent.VK_CONTROL); robo.keyPress(KeyEvent.VK_V);
		 * robo.keyRelease(KeyEvent.VK_V); robo.keyRelease(KeyEvent.VK_CONTROL);
		 * System.out.println("hi4");
		 * 
		 * robo.keyPress(KeyEvent.VK_ENTER); robo.keyRelease(KeyEvent.VK_ENTER);
		 * System.out.println("hi5");
		 * 
		 */
			
			
			
			
			
			
			
			
		
	}

}
