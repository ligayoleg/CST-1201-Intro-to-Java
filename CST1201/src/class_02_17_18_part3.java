import java.util.Scanner;
public class class_02_17_18_part3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);	
		/*Two MAjor Types of Data:
		 * 1. Primitive Data:
		 * 		a. Integer
		 * 		b. Byte
		 * 		c. Short
		 * 		d. Double
		 * 		e. Boolean
		 * 
		 * 2. Reference Data Type:
		 * 		a. String
		 * */
		
//		CHARACTER vs STRING
		
//		==============CHARACTER===========================
//		Declare Character
		char nameOfChar = 'a';
		
//		We can increment characters because they are stored binary in a machine
		char ch = 'a';
//		System.out.println(++ch);
		
//		Incoding is a process of converting characters to numbers
//		Decoding is a reverse process of converting numbers to characters
		
//		To check for character is  a character or not:
		boolean res = Character.isLetter(ch);
//		System.out.println(res);
		
//		=============STRING!========================
//		Allows to store multiple characters

		//		Declare String
		String nameOfString = "Hello, World!";
		String hello = "Hello";
		String world = "world";
		String con = hello.concat(world);
//		System.out.println(con);
		
		String s1  = "Welcome to java";
//		1.Search for e
		System.out.println("1.The e is at " + s1.indexOf("e"));
//		2. Return length of the string s1
		System.out.println("2.The length of the string: "+ s1 + ", is " + s1.length());
//		3. Return charter at location 0 and 2
		System.out.println("3.The characters at location 0 and 2 are: " + s1.charAt(0) + " and " + s1.charAt(2));
//		4. Convert string to upper case.
		System.out.println("4."+s1.toUpperCase());
//		5. Check if string starts with "Wel".
		System.out.println("5." + s1.startsWith("Wel"));
//		6. Check if string starts with "Hi"
		System.out.println("6." + s1.startsWith("Hi"));
//		7. Check if string ends with "java"
		System.out.println("7." + s1.endsWith("java"));
//		8.Check if string contains "come" is in a substring of s1
		if(s1.substring(0) == "come") {
			System.out.println("8." + true);
		}
//		9. Check if string contains "e" after location 3
		if(s1.indexOf('e', 3) != 0) {
			System.out.println("9." + true);
		}
//		10. Check if string contains "ja" between location 7 and 14
		if(s1.indexOf("ja", 7) != 0) {
			System.out.println("10." + true);
		}
		
		
	}

}
