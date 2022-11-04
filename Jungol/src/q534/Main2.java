package q534;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char score = sc.next().charAt(0);
		sc.close();
		
		switch(score) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Usually");
			break;
		case 'D':
			System.out.println("Effort");
			break;
		case 'F':
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
		}

	}

}
