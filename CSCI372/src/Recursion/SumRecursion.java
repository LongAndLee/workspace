package Recursion;

import java.util.Scanner;

public class SumRecursion {

	public static void main(String[] args) {
		
		System.out.println("The total sum is: " + recursionSum(5));

	}
	

	public static int recursionSum(int i) {
		if(i > 0) {
			try (Scanner myObj = new Scanner(System.in)) {
				System.out.println("Enter " + i +"th number:"); 
				int x = myObj.nextInt();   
				   
				System.out.println("choice is: " + x);
				
				return x + recursionSum(i-1);
			}
		}
		return 0;
	}
	
}
