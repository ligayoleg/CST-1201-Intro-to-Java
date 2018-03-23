package class_03_03_18;
import java.util.Scanner;
import java.text.*;
public class part_1 {
/***********************
 *  LOOPS
 * ********************/
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		/**
		 * Three types of loops:
		 * 1. For
		 * 2. While
		 * 3. Do while
		 */

//		TASK#1
		//Create two random numbers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		System.out.println(
				"What is " + number1 + " + " + number2 + "?"
		);
		int answer = input.nextInt();
		
		while(number1 + number2 != answer) {
			System.out.println(
					"The sum is not correct, try again! What is the sum of: " + number1 + " + " + number2+ "?"
					);
			answer = input.nextInt();
		}
		System.out.println("You got it!");
		
		//TASK#2
		//break - terminate loop
		//continue - skip condition and keep going.
		
		int n;
		double a;
		double r = 0.05;
		double p = 1000;
		System.out.println("How many years do you want to calculate?");
		n = input.nextInt();
		for(int i = 1; i <= n; i++) {
			a = p * Math.pow(1 + r, i);
			DecimalFormat af = new DecimalFormat("#.##");
			System.out.println(i + " year -> " + af.format(a) + " is an amount you would get.");
		}
		
		System.out.println("------------------------------------");
		System.out.println("////////////////////////////////////");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("------------------------------------");
		
		
		/*Print out the square root of numbers from 1 to 10*/
		
		for(int k = 1; k <= 10; k++) {
			System.out.println(Math.sqrt((double)(k)));
		}
		
		System.out.println("------------------------------------");
		System.out.println("////////////////////////////////");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("------------------------------------");
		
		/*Read the string from user, and then you need to read a character from user
		 * find the character in a string.*/
		System.out.println("Gice me a string!" );
		String x = input.next();
		System.out.println("Give me a character!" );
		char c = input.next().charAt(0);
		boolean isPart;
		for(int i = 0; i < x.length(); i++) {
			if(c == x.charAt(i)) {
//				System.out.println("Character \'" + c + "\' is part of string:\"" + x + "\"" );
				isPart = true;
				
			} else {
//				System.out.println("Character \'" + c + "\' is NOT part of string:\"" + x + "\"" );
				isPart = false;
			}
			System.out.println(isPart);
		}
		
		
	}

	
	
	
	
}
