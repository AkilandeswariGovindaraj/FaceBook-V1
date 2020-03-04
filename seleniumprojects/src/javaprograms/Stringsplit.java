package javaprograms;

public class Stringsplit {

	public static void main(String[] args) {
		
		String s = "Testcasespassed30Testcasesfailed24TestcaseSkipped25";
		
		String s1 = s.replaceAll("\\D", " ");
		
		System.out.println(s1);
		s1.trim();
		while (s1.contains("  "))
		{
		String s2 = s1.replaceAll("  ", " ");
		s2 = s1;
		}
		 


		
		
		
				
				
		
		
	}

}
