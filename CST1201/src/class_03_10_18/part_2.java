package class_03_10_18;

public class part_2 {

	public static void main(String[] args) {
		
		double minNumber = min(10.5, 10.55);
		System.out.println(minNumber);
		
		int myage = age(1957);
		System.out.println(myage);
	}
	
private static int age(int year) {
		// TODO Auto-generated method stub
		return 0;
	}

	//	FIND MINIMUM NUMBER
	public static double min(double num1, double num2) {
		
		double result;
		
		if(num1 < num2) {
			result = num1;
		} else {
			result = num2;
		}
		
		return result;
		
	}
	
	
/* 	<<<<<<<<<======NOTES========>>>>>>>>>>>
  Quew and stack:
  Stack - is a spot in a memory. FILO - first in, last out.
 	layered part of a memory, where it keeps track how things get 
  	proceeded.
  
  If your method does not need to return a value you need to use a "void"
  keyword.
  */
}
