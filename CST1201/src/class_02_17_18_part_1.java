import java.util.Scanner;
public class class_02_17_18_part_1 {

	public static void main(String[] args) {
//		SWITCH Statements
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		double x1 = input.nextInt();
		System.out.println("Enter calculation:");
		char cal = input.next(".").charAt(0);
		System.out.println("Enter another number:");
		double x2 = input.nextInt();
		double result = 0;
		
		//Add
		if(cal == '+'){
			result = x1 + x2;
		}
		//Substract
		else if(cal == '-'){
			result = x1 - x2;
		}
		//Multiply
		else if(cal == '*'){
			result = x1 * x2;
		}
		//Divide
		else if (cal == '/'){
			result = x1 / x2;
		}
		
		//Remainder
		else if (cal == '%') {
			result = x1 % x2;
		}
		
		System.out.println("The result is: " + result);
	}

}
