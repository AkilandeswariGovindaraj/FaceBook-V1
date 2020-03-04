package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelexample {
	WebDriver driver;
	String animal;
	String bird;
	
	
	Cell data = null;

	@DataProvider(name = "exceldata")
	
	public Cell getdatafromprovider() throws Exception
	
	{
		
		data = getdatafromexcel();
		return data;
	}
	@Test(dataProvider = "exceldata")
	public void testcase1(String abc,String xyz)
	{
	
	System.out.println(animal);
	System.out.println(bird);
	
	}
	@Test
	public Cell getdatafromexcel() throws Exception
	{
	Cell c = null;
	
	
		FileInputStream excel1 = new FileInputStream("C:\\Users\\Govindaraj\\Desktop\\Akil\\Akila v2.0\\testdata1.xlsx");
		
		Workbook wb = new XSSFWorkbook(excel1);
		Sheet s1 = wb.getSheet("animals");
		
		Iterator<Row> rowvalue =s1.rowIterator();
		while(rowvalue.hasNext())
		{  
			Row r1 = rowvalue.next();
			Iterator<Cell> c1 = r1.cellIterator();
			while (c1.hasNext())
			{    c =    c1.next();
			System.out.println(c);	
						
			}
										
		}
						
		return c;			
}}
	
	
	


