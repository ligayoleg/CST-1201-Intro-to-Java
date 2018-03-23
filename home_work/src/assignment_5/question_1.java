/*
	 	Question 1
	 	Write a method with the following header to 
	 	display an integer in reverse order:
	 	 public static void reverse(int number)
	 	For example, reverse(3456) displays 6543. Write a test program
	 	that prompts the user to enter an integer and displays its 
	 	reversal.
	 */

package assignment_5;
import java.util.Scanner;
public class question_1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Give me a number: ");
		int n = input.nextInt();
		int nReversed = reverse(n);
		System.out.println("The reversed number is: " + nReversed);

	}
	
	public static int reverse(int number) {
		
		int reverseNum = 0;
		while(number != 0){
			reverseNum = (reverseNum*10)+(number%10);
			number = number/10;
		} 
		return reverseNum;
	}

}
