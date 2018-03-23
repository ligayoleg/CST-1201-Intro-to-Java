import java.util.Scanner;
public class class_02_17_18_part_2_calculator_using_switch {

	public static void main(String[] args) {
//		SWITCH Statements Calculator>
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		double x1 = input.nextInt();
		System.out.println("Enter calculation:");
		char cal = input.next(".").charAt(0);
		System.out.println("Enter another number:");
		double x2 = input.nextInt();
		double result = 0;
		
		switch(cal) {
			case '+': result = x1 + x2; break;
			case '-': result = x1 - x2; break;
			case '*': result = x1 * x2; break;
			case '/': result = x1 / x2; break;
			default: System.out.println("Check your values and operators!");
		}
		System.out.println(result);
		
//		y = (x = 0) ? 1 : -1
//		if x = 0 then assign 1 to y else assign -1 to y
	}

}
