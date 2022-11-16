package q574;

import java.util.Scanner;

public class Main {
	public static int max(int x, int y, int z) {
		int max = Integer.MIN_VALUE;

		if (x > y && x > z) {
			max = x;
		} else if (y > z && y > x) {
			max = y;
		} else {
			max = z;
		}

		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		System.out.println(max(a, b, c));
	}
}
