package MomeWorks;

import java.util.Scanner;

public class whileLoop {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your Number: "); 
	int num = scan.nextInt();
	int sum = 0;
	int i = 0;
	while (i <= num) {
		sum = sum + i;
		i++;
	}
	System.out.println("Sum of the first " + num + "digit is = " + sum);
	
	
}
}
