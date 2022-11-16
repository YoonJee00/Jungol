package q121;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if (num < 0) {
			System.out.println("minus");
		} else if (num > 0) {
			System.out.println("plus");
		} else {
			System.out.println("zero");
		}

	}

}
