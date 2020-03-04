package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class c1 {
	
	/*
	 * String[] term = {"Akila","Rakshana","Madhu"};
	 * 
	 * @DataProvider(name = "Provider1") public String searchterm(String abc) {
	 * return abc;
	 * 
	 * }
	 */
	
	
	WebDriver driver; 

@BeforeSuite 

	public void launch()
	
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe"
		 * );
		 */
	driver  = new ChromeDriver();
	driver.manage().window().maximize();
	/*driver.manage().timeouts().implicitlyWait(10,TimeUnit Seconds);*/
	}


	  @Test(priority = 1)
	  @Parameters("searchterm")
	  public void First(String xyz) throws Exception
	  { 
		  driver.get("http://www.bing.com");
		  WebElement searchbox = driver.findElement(By.id("sb_form_q"));
		  searchbox.sendKeys(xyz);
		  Thread.sleep(3000);
		  System.out.println("First");
	  }
	  
	  @Test(priority = 2)
	  public void Second()
	  { 
		  driver.get("http://www.bing.com"); 
		
		  System.out.println("Second");
	  }
	  
	  @Test(priority = 3)
	  public void ahird()
	  { 
		  driver.get("http://www.bing.com");
		
		  System.out.println("Third");
	  }
	  
	  @Test(priority = 4)
	  public void Fourth()
	  { 
		  driver.get("http://www.bing.com"); 
		  WebElement searchbox = driver.findElement(By.id("sb_form_q"));
		  searchbox.sendKeys("xyz" + Keys.ENTER);
		
		  System.out.println("Fourth");
	  }
	
	

@AfterSuite
public void qt()
{
driver.quit();
System.out.println("Done");
}
}
