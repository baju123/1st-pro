
import java.util.Scanner;

public class TestLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the # of lines: ");
		int input = scan.nextInt();

		for (int i = input; i >= 1; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print(i-j + " ");

			}
			System.out.println("");
		}
	}
}