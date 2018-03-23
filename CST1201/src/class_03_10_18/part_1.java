package class_03_10_18;

public class part_1 {

	public static void main(String[] args) {
//		Store a method in a variable
		int sumMyNumbers = sum (1, 10);
//		print out the the result
		System.out.println(sumMyNumbers);

	}
	
//	Declare a method outside of public static void main
	public static int sum(int i1, int i2) {
		int sum = 0;
		for(int i = i1; i <= i2; i++) {
			sum += i;
		}
		return sum;
	}
	

}
