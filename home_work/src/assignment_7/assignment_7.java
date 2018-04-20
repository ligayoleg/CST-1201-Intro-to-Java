package assignment_7;
import java.util.Random;
public class assignment_7 {

	public static void main(String[] args) {
		/*
		 Write a java program that Create an array to hold 10 double values.  Write Java statements to do the following:


1.	Assign the value 5.5 to the first element in the array.

2.	Assign the value 6.9 to the last element in the array. 

3.	Assign random numbers for the rest of the elements of the array,

4.	Write a loop that computes the sum of all elements in the array. 

5.	Randomly generate an index and display the element of this index in the array.

6.	Create another array and copy the contents of first array into second array.
 
		 */
		double [] numArr = new double[10];
		Random ranNum= new Random();
		
		//1. Assign the value of 5.5 to the first element in the array.
		numArr[0] = 5.5;
		System.out.println(numArr[0]);
		
		//2. assign the value of 6.9 to the last element in the array.
		numArr[numArr.length - 1] = 6.9;
		System.out.println(numArr[numArr.length - 1]);
		
		//3. assign random number for the rest of the elements in the array
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] == 0.0) {
				numArr[i] = Math.random();
			}
		}
		
		//4. write a loop that computes the sum of all elements in the array.
		double sum = 0.0;
		for(int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		System.out.println("the sum of an array is: " + sum);
		
		//5. Randomly generate an index and display the element of this index in the array.
		
		
		//6.	Create another array and copy the contents of first array into second array.
		double [] arrNum2  = new double[10];
		for(int i = 0; i < arrNum2.length; i++) {
			arrNum2[i] = numArr[i];
		}
		
		
		//print out the array 
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + ", ");
		}
		System.out.println();
		//print out the array 
		for(int i = 0; i < arrNum2.length; i++) {
			System.out.print(arrNum2[i] + ", ");
		}
		

	}
	
	
}
