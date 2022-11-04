package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char score = sc.next().charAt(0);
		sc.close();
		
		if (score == 'A') {
			System.out.println("Excellent");
		} else if (score == 'B') {
			System.out.println("Good");
		} else if (score == 'C') {
			System.out.println("Usually");
		} else if (score == 'D') {
			System.out.println("Effort");
		} else if (score == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
	}

}
