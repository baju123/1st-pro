package edu.java;

import java.util.Scanner;

public class LoopTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the # of lines: ");
		int input = scan.nextInt();
		
		for (int i = 1; i < 10; i++) {
				
			for (int j = 1; j < i; j++) {
				System.out.print("1");
				
			}
			System.out.println("");
		
	}
	}
}


