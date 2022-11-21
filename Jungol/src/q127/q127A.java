package q127;

import java.util.Scanner;

public class q127A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[100];
		int i = 0;
		for (; i < inp.length; i++) {
			inp[i] = sc.nextInt();
			if (0 > inp[i] || inp[i] > 100) {
				sc.close();
				break;
			}
		}
		int sum = 0;
		for (int j = 0; j < i; j++) {
			System.out.print(inp[j] + " ");
			sum += inp[j];
		}

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) sum / i);

	}

}
