package home.stumarks;

import java.util.Scanner;

public class marks {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("Enter the Marks: ");
		scan.nextInt();
		double studentMarks[] = {87,85,90,77,92,70};
		double totalMarks = 0; int average = 0; 
		for (int i = 0; i < studentMarks.length; i++) {
			totalMarks = totalMarks + studentMarks[i];
			
		}
				System.out.println("Total mark is: " + totalMarks);
				average = (int) (totalMarks/studentMarks.length);
				System.out.println("Average mark is: " + average );

}
}