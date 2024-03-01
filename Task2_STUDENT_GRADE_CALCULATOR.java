import java.util.Random;
import java.util.Scanner;

public class Task2_STUDENT_GRADE_CALCULATOR {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
		
		int number = 0, count = 0, level = 1, sum = 0;
		int [] marks;
		
		
		System.out.println("Enter number of Subjects: ");
		int numberSubjects = inputNum.nextInt();
		
		int TotalSubjects = 0;
		TotalSubjects = numberSubjects;
		
		System.out.println("\n");
		marks = new int[numberSubjects];
		
		while(numberSubjects > 0)
		{
			System.out.print("Enter mark " + level + ": ");
			number = input.nextInt();
			
			marks[count] = number;
			
			numberSubjects--;
			count++;
			level++;
		}
		
		
		for(int i = 0; i<marks.length;i++)
		{
			sum = sum + marks[i];
		}
		
		int avarage = 0;
		String results = "";
		
		avarage = (sum / TotalSubjects);
		
		if(avarage < 50)
		{
			results = "Grade-Failed";
		}
		else if(avarage >= 50 || avarage < 75)
		{
			results = "Grade-Passed";
		}
		else
		{
			results = "Grade-Passed. Distinction";
		}
		
		System.out.println("\nTotal Marks: " + sum + "\nAverage percentage: " + avarage + "\nResults:" + results);
	}

}
