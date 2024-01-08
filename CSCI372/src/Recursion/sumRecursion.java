package Recursion;

import java.util.Scanner;

public class sumRecursion {

	public static int recursionSum(int i) {
		
		//i>0 is condition for return
		if(i > 0) {
			
			//use try method in case user does not input number
			try (Scanner myObj = new Scanner(System.in)) {
				
				//statement to get input from user
				System.out.println("Enter " + i +"th number:"); 
				int x = myObj.nextInt();   
				   
				//confirm user input
				System.out.println("choice is: " + x);
				
				//return method
				return x + recursionSum(i-1);
			}
		}
		
		//return method to ensure recursion ends
		return 0;
	}
	
}
