package edu.bcas.pro;

import java.util.Scanner;

public class MyTest {
	
public static void main(String[] args) {
	int marks;
	int incrementValue = 10;
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter your Name:");
	String name = scan.next();
	
	System.out.print("Enter your marks: (Number only):");
	marks = scan.nextInt();
	
	int newMarks = marks + incrementValue;
	
	System.out.println("Hi " + name + " your mark is " + newMarks);
	
}

}