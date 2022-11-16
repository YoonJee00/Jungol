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

			if (max < num[i] && num[i] < 100) {
				max = num[i];
			} 
			if (num[i] < min && num[i] >= 100) {
				min = num[i];
			}
		}
		
		if (max == Integer.MIN_VALUE) {
			max = 100;
		}
		if (min == Integer.MAX_VALUE) {
			min = 100;
		}
		sc.close();
		System.out.println(max + " " + min);
	}
}
