package home_work_1;
import java.util.Scanner;
public class assignment_2_question_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		QUESTION 2
		System.out.println("Give me a number:");
		int n1 = input.nextInt();
		
		
		if(n1 % 5 == 0 && n1 % 6 == 0) {
			System.out.println("The number " + n1 + " is divisible by 5 and 6.");
		} else if(n1 % 5 == 0 || n1 % 6 == 0) {
			System.out.println("The number " + n1 + " is divisible by 5 or 6, but not both.");
			if(n1 % 5 == 0) {
				System.out.println("Also, the number " + n1 + " is divisible by 5, but not by 6.");
			} else if( n1 % 6 == 0) {
				System.out.println("Also, the number " + n1 + " is divisible by 6, but not by 5.");
			}
		} else{
			System.out.println("The number " + n1 + " is not divisible by either 5 or 6.");
		} 
	}

}
