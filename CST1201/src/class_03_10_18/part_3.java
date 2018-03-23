package class_03_10_18;

public class part_3 {

	public static void main(String[] args) {
//		 print num1 and num2 values
//		call the swap method
//		print num1 and num2 after swap
		int x1 = 2;
		int x2 = 3;
		System.out.println("Before: " + x1 + " and " + x2);
		swap(x1, x2);
		System.out.println("After: " + x1 + " and " + x2);
		

	}
	
	public static  void swap (int num1, int num2) {
//		swap num1 and num2
//		print num1 and num2 values
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println(num1);
		System.out.println(num2);
	}

}
