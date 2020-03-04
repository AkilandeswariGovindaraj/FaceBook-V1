import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class personal {

	public static void main(String[] args) {
		 String a = null;

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/channel/UCiKEK85ndAfzyI4A7kkit7Q/videos?view=0&sort=dd&flow=grid");
		
		
		List<WebElement> list = driver.findElements(By.xpath("//a[@id=video-title]"));
		for (WebElement webElement : list) {
			
			  webElement.getText;
			
				
		}
	
		System.out.println(a);
		System.out.println(list.size());






		

	}

}
