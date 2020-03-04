package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import java.lang.*;


public class rakshana {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("************************");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Window.html");
		/*
		 * WebElement editbox =
		 * driver.findElement(By.className("wp-categories-icon svg-image"));
		 * editbox.click();
		 */

		/*
		 * WebElement Email = driver.findElement(By.id("email"));
		 * Email.sendKeys("Akila@gmail.com");
		 * 
		 * WebElement Appendtext =
		 * driver.findElement(By.xpath("//input[@value='Append ']"));
		 * Appendtext.sendKeys("Akila");
		 * 
		 * WebElement defaulttext = driver.findElement(By.name("username"));
		 * defaulttext.getAttribute("value");
		 * 
		 * WebElement cleartext =
		 * driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		 * cleartext.clear();
		 * 
		 * WebElement disabledtext = driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		 * disabledtext.getAttribute("disabled"); Boolean val =
		 * disabledtext.isEnabled(); if(val == true) { System.out.println(disabledtext
		 * +"enabled");
		 * 
		 * } else
		 * 
		 * {
		 * 
		 * System.out.println(disabledtext +"disabled");
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
		
		/*
		 * WebElement positionbutton = driver.findElement(By.id("position"));
		 * 
		 * Point p1= positionbutton.getLocation(); int xvalue = p1.getX(); int yvalue =
		 * p1.getY(); System.out.println("position is(" + xvalue + "," + yvalue +")" );
		 */
		/*
		 * WebElement positionbutton = driver.findElement(By.id("color")); String s1 =
		 * positionbutton.getCssValue("background-color"); System.out.println(s1);
		 */
		/*
		 * WebElement D1 = driver.findElement(By.id("dropdown1")); Select s1 = new
		 * Select(D1); s1.selectByIndex(0); Thread.sleep(3000); s1.selectByValue("2");
		 * Thread.sleep(3000); s1.selectByVisibleText("Appium");
		 * 
		 * D1.sendKeys("Loadrunner"); List<WebElement> l1 = s1.getOptions(); int
		 * totaloptions = l1.size(); System.out.println("totaloptions"); for(int
		 * i=0;i<totaloptions;i++) { System.out.println(l1.get(i).getText()); }
		 * WebElement f1= s1.getFirstSelectedOption(); System.out.println(f1.getText());
		 */
		/*
		 * WebElement D1 =
		 * driver.findElement(By.xpath("//button[@onclick ='normalAlert()']"));
		 * D1.click(); Alert a1 = driver.switchTo().alert(); Thread.sleep(3000);
		 * a1.accept();
		 * 
		 * WebElement D2 =
		 * driver.findElement(By.xpath("//button[@onclick ='confirmAlert()']"));
		 * D2.click(); Alert a2 = driver.switchTo().alert(); Thread.sleep(3000);
		 * a2.dismiss();
		 */
		
		/*
		 * WebElement D3 =
		 * driver.findElement(By.xpath("//button[@onclick ='confirmprompt()']"));
		 * D3.click(); Alert a3 = driver.switchTo().alert(); a3.sendKeys("Hi Alert");
		 * Thread.sleep(3000); a3.dismiss();
		 */
		/*
		 * WebElement D3 = driver.findElement(By.xpath(
		 * "//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]")); D3.click();
		 * System.out.println(D3.isSelected());
		 */
		
		/*
		 * WebElement homebutton = driver.findElement(By.id("home"));
		 * homebutton.click();
		 * 
		 * 
		 * 
		 * String main = driver.getWindowHandle(); Set<String> s1=
		 * driver.getWindowHandles(); for(String str :s1) {
		 * driver.switchTo().window(str); } WebElement editbox =
		 * driver.findElement(By.xpath("//img[@alt = 'Edit / Text Fields']"));
		 * editbox.click(); driver.close();
		 * 
		 * 
		 * driver.switchTo().defaultContent();
		 */
		
		WebElement homebutton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		System.out.println("d1");
		homebutton.click();
		String main = driver.getWindowHandle();
		Set<String> s1= driver.getWindowHandles();
		System.out.println(s1.size());
		
	 for (String str : s1)
	 {
		 
		 if(!str.equals(main))
		 {
			 driver.switchTo().window(str);
			 driver.close();
			 
		 }
		 else
		 {
			 System.out.println("good");
		 }
	 }
		
		
				
}}
