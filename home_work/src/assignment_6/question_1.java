package assignment_6;
import java.util.Scanner;
public class question_1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		Ask for number of students
		System.out.print("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		
//		Ask for 4 scores
		System.out.print("Enter " + numOfStudents + " scores: ");
		int[] scores = new int[numOfStudents];
		for(int i = 0; i < numOfStudents; i++) {
			scores[i] = input.nextInt(); 
		}
		
//		Initiate the best variable
		int best = 0;
//		Loop through the scores to find the best one and assign to var best
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > best) {
				best = scores[i];
			}
		}
		System.out.println(best);
		
		//String bestGrade1 = gradeCheck(best, scores);
		//System.out.println(bestGrade1);
	}
	
	
//	Create a function that checks what grade to give to score
public static String[] gradeCheck(int best, int[] scores) {
		String grade;
		String[] grades;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= best - 10) {
				grade = "A";
				grades[i] = grade;
			}else if(scores[i] >= best - 20) {
				grade = "B";
			} else if(scores[i] >= best - 30) {
				grade = "C";
			}else if(scores[i] >= best - 40) {
				grade = "D";
			}else{
				grade = "F";
			}
		}
		
	}
}
	
	
	



