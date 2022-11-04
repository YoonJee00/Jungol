package q535;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		sc.close();
		
		score = (int) score * 10;
		
		switch ((int)score / 10) {
		case 4:
			System.out.println("scholarship");
			break;

		case 3:
			System.out.println("next semester");
			break;

		case 2:
			System.out.println("seasonal semester");
			break;

		default:
			System.out.println("retake");
		}
		

	}

}
