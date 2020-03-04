package javaprograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Removinguplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myarr[] = {3,5,7,3,4,5,7,3,8,3};
		int n = myarr.length;
		
		
		int uniquevalue =n;
		
		for (int i =0;i<uniquevalue;i++)
		{for(int j =i+1;j<uniquevalue;j++)
		{
			
			
			if(myarr[i]==myarr[j])
			{
				myarr[j] = myarr[uniquevalue-1];
				
				uniquevalue--;
				j--;
			}
			
			
		}
		System.out.println(uniquevalue);
		System.out.println(n);
		
		
		int[] newarr = Arrays.copyOf(myarr, uniquevalue);
		
		
		for(int k=0;k<uniquevalue;k++)
		{
			System.out.print(newarr[k] +"\t");
		}
		}
		
		
		
		
		
	}

}
