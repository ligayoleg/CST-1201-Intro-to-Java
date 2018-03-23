import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		
		System.out.print("Give me number in feet that I will convert to meters:  ");
		Scanner input = new Scanner(System.in);
//		Question #1
//		Single main method that asks the user to input in feet, converts to meters.
		//Declare float for feet and input float from Scanner.
		float feet = input.nextFloat();
		//Calculate meters based on 1 foot is 0.305 of a meter.
		float meters = (float)(feet*0.305);
		System.out.println(feet + " feet is equal to " + meters + " meters.");
		
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		
//		Question #2
//		Write a program that displays the table.
		
		//Create a setup with integers of a, b, and power.
		//Print out the header of the table.
		int a;
		int b;
		int power;
		System.out.println("a     "   +   "     b     "     +    "     pow(a,b)");
		
		//Assign values for a and b
		a = 1;
		b = 2;
		//Convert float of Math.pow to integer with (int) and calculate a power b.
		power = (int)(Math.pow(a, b));
		System.out.println( a + "          " + b + "          " + power);
		
		//Add one to a and b, and repeat the process.
		a++;
		b++;
		power = (int)(Math.pow(a, b));
		System.out.println( a + "          " + b + "          " + power);
		
		a++;
		b++;
		power = (int)(Math.pow(a, b));
		System.out.println( a + "          " + b + "          " + power);

		a++;
		b++;
		power = (int)(Math.pow(a, b));
		System.out.println( a + "          " + b + "          " + power);
		
		a++;
		b++;
		power = (int)(Math.pow(a, b));
		System.out.println( a + "          " + b + "          " + power);
		
	}

}
