package q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		sc.close();

		double result = (double)(num * 91.44);
		System.out.printf("yard? %.1fyard = %.1fcm", num, result);

	}

}
