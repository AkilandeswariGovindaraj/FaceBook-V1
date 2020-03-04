package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEbTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/table.html");
		
		/*
		 * List<WebElement> row
		 * =driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		 * 
		 * int n = row.size(); System.out.println(n);
		 * 
		 * List<WebElement> coloumn
		 * =driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		 * 
		 * int m = coloumn.size(); System.out.println(m);
		 * 
		 * 
		 * String Xpath1 = "//*[@id='customers']/tbody/tr[";
		 * 
		 * String Xpath2 = "]/td[";
		 * 
		 * String xpath3 = "]";
		 * 
		 * 
		 * 
		 * for(int i=2;i<n+1;i++) { for(int j=1;j<m+1;j++)
		 * 
		 * { Thread.sleep(3000); String Actualxpath = Xpath1+i+Xpath2+j+xpath3;
		 * WebElement cellvalue = driver.findElement(By.xpath(Actualxpath));
		 * System.out.print(cellvalue.getText() + " ");
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(" ");
		 * 
		 * }
		 */
		
		


	}
	
	

}
