package q113;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int l = sc.nextInt();
		sc.close();

		System.out.println("width = " + (w + 5));
		System.out.println("length = " + (l * 2));
		System.out.println("area = " + (w + 5) * (l * 2));

	}

}
