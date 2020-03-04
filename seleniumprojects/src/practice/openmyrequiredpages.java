package practice;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openmyrequiredpages {

	public static void main(String[] args) throws IOException {
		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * 
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 * driver.get("https://www.youtube.com");
		 * 
		 * WebElement searchterm =
		 * driver.findElement(By.xpath("//input[@id = 'search']"));
		 * searchterm.sendKeys("#learnautomationonline"+Keys.ENTER);
		 */
			
			
			
		/*
		 * FileInputStream excel1 = new
		 * FileInputStream("C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\selenium plan.xlsx"
		 * ); Workbook wb = new XSSFWorkbook(excel1); Sheet s = wb.getSheetAt(0);
		 */
			
			File excel1 = new File("C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\selenium plan.xlsx");
			
			Desktop.getDesktop().open(excel1);
			
			Throwable th = new Throwable();
			
			

}
}
