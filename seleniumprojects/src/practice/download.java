package practice;

import java.io.File;
import java.util.List;

public class download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File Location = new File("C:\\Users\\Govindaraj\\Desktop");
	File[] files = Location.listFiles();
	
	for (File file : files) {
		
		if(file.getName().equals("Rakshana painting.png"));
		{
		System.out.println("File exists");
	}	
		
		
	}
	
		
		
		
		

	}}


