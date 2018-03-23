package class_03_03_18;
import java.util.Scanner;
public class part_2_higher_lower {
/***********************
 *  LOOPS
 * ********************/
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		

//		
		int number1 = (int)(Math.random() * 10);
		
		
		System.out.println(
				"What is a number. Guess it.?"
		);
		int answer = input.nextInt();
		
		while(number1 != answer) {
			if(number1 > answer) {
				System.out.println("Your number is too high. Try again.");
				answer = input.nextInt();
			} else {
				System.out.println("Your number is too low. Try again.");
				answer = input.nextInt();
			}
		}
		System.out.println("You got it!");
		
	}

}
