package practice;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class frames {

	public static void main(String[] args) throws Exception  {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		

		/*
		 * TakesScreenshot tc = (TakesScreenshot) driver; System.out.println("hi1");
		 * File source = tc.getScreenshotAs(OutputType.FILE); System.out.println("hi2");
		 * File dest = new File
		 * ("C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\screenshot.sample.png");
		 * System.out.println("hi3"); FileHandler.copy(source, dest);
		 * 
		 * System.out.println("hi4");
		 */
		WebElement al = driver.findElement(By.xpath("//*[@onclick='normalAlert()']"));
		al.click();
		Robot robo = new Robot();
		
		Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect = new Rectangle(d);
		
		BufferedImage bf = robo.createScreenCapture(rect);
		
		File dest = new File("C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\screenshot\\sample1.png");
	ImageIO.write(bf,"png",dest);
		
		
	
	}}