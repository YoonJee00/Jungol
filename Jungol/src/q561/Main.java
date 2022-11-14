package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();

			if (num[i] < 100) {
				if (max < num[i]) {
					max = num[i];
				} else {
					max = 100;
				}
			} else if (num[i] >= 100) {
				if (min > num[i]) {
					min = num[i];
				}
			}
		}
		sc.close();
		System.out.println(max + " " + min);

	}

}
