package assignment_4;
import java.util.Scanner;
public class assignment_4_question_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		Scanner input1 = new Scanner(System.in);
//		Ask for a string
		System.out.println("Enter a string:");
		String str1 = input.next();
		
//		Ask for a letter
		System.out.println("Enter a letter:");
		char ch1 = input1.next().charAt(0);
		System.out.println(ch1);
//		Print out how many times letter repeats in a given string;
		//create a variable for count of letters;
		int lttrCount = 0;
		
		//Loop to check character to every letter of the string.
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == ch1) {
				lttrCount++;
			}
			else {
				lttrCount = 0;
			}
		}
		
		
		//Conditional to print the count of letters or print that none are there.
		if(lttrCount == 0) {
			System.out.println("There were no occurences of the letter.");
		} else {
			System.out.println("The letter " + ch1 + " appeared " + lttrCount + " times.");
		}
		
	}

}
