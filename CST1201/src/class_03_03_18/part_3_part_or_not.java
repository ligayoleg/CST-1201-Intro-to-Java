package class_03_03_18;
import java.util.Scanner;
public class part_3_part_or_not {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		/*Read the string from user, and then you need to read a character from user
		 * find the character in a string.*/
		
		//Declare string
		System.out.println("Gice me a string!" );
		String x = input.next();
		//Declare character
		System.out.println("Give me a character!" );
		char c = input.next().charAt(0);
		
		boolean isPart;
		for(int i = 0; i < x.length(); i++) {
			//Check if character is part of a string
			if(c == x.charAt(i)) {//<- if character is part of a string
				isPart = true;
				System.out.println(isPart);
				break;
			} else {//<-- if character is not part of a string.			
				isPart = false;
			}
			System.out.println(isPart);
		}
		
		

	}

}
