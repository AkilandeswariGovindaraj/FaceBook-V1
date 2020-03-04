package practice;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class draganddrop
{

	public static void main(String[] args) throws IOException  {
		
		// TODO Auto-generated method stuSystem.setProperty("webdriver.chrome.driver","C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\chrome\\chromedriver.exe");
		/* WebDriver driver = new ChromeDriver(); */

		/*driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.xpath("//*[contains(text(),'Drag me to my target')]"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop);*/
		
		
		FileInputStream xl = new FileInputStream("C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\testdata1.xlsx");
		Workbook wb = new XSSFWorkbook(xl);
		
		Sheet s1 = wb.getSheetAt(0);
		
		Iterator<Row> rowiterator = s1.iterator();
		
		
		while (rowiterator.hasNext())
		{  Row rowvalue = rowiterator.next();
		
		Iterator<Cell> c = rowvalue.iterator();
		
		while (c.hasNext())
		{
		Cell cvalue = c.next();
		System.out.println(cvalue);
		
		
		
		}
		
		

	}}}


