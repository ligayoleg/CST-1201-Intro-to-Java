package home_work_1;
import java.util.Scanner;
public class assignment_2 {

	public static void main(String[] args) {
		
//	QUESTION 1 
		Scanner input = new Scanner(System.in);	
		int num1, num2, num3;
		int max, mid, min;
		max = 0;
		mid = 0;
		min = 0;
		System.out.println("Give me three numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

//		Find the max
		if(num3 > num2 && num3 > num1) {
			max = num3;
		} else if (num2 > num1 && num2 > num3) {
			max = num2;
		} else if (num1 > num2 && num1 > num3) {
			max = num1;
		}
//		Find the min
		System.out.println(max + " is the biggest number.");
		if(num1 < num2 && num1 < num3) {
			min = num1;
		} else if(num2 < num1 && num2 < num3) {
			min = num2;
		}  else if(num3 < num1 && num3 < num1) {
			min = num3;
		} 
		System.out.println( min + " is the smallest number.");
//		Find the mid
		if(max != num1 && min != num1) {
			mid = num1;
		} else if(max != num2 && min != num2) {
			mid = num2;
		} else if(max != num2 && min != num3) {
			mid = num3;
		}
		
		System.out.println(mid + " is the middle number between " + max + " and " + min + ".");
		System.out.println("================================");
		System.out.println(min + " < " + mid + " < " + max);
		}
		
		
		
		


}
