package practice;

import java.awt.Robot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		Takescreenshot ts = (Takescreenshot)driver;
		
		File source = ts.getscreenshotAs(OutputType.FILE);
		
		File file1 = new File ("C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\A.jpg");
		
		Filehandles.copy(source,file1);
		Fileutils.copy(source,file1)
		
		
		Robot robo = new Robot();
		
		Dimension d = robo.getscreensize();
		Rectangle rec = new Rectangle (d);
		
		BuildBuffer = robo.createscreencapture(rec);
		
		ImageIO.
		
		

	}

}
