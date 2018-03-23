package class_03_10_18;

public class part_4 {

	public static void main(String[] args) {
//		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
//		FORMULA TO USE
		double compareDoubles = minimum (10.5, 10.6);
		int compareInts = minimum (20, 30);
		
		System.out.println(compareDoubles);
		System.out.println(compareInts);
	}
	
//	FIND MINIMUM NUMBER
	public static double minimum(double num1, double num2) {
		
		double result;
		
		if(num1 < num2) {
			result = num1;
		} else {
			result = num2;
		}
		
		return result;
		
	}
	
//	FIND MINIMUM NUMBER
	public static int minimum(int num1, int num2) {
		
		int result;
		
		if(num1 < num2) {
			result = num1;
		} else {
			result = num2;
		}
		
		return result;
		
	}
	

}
