package q115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Mheight = sc.nextInt();
		int Mweight = sc.nextInt();
		int Kheight = sc.nextInt();
		int Kweight = sc.nextInt();
		sc.close();

		if (Mheight > Kheight && Mweight > Kweight) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
