package q135;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		int sum3 = 0;
		int sum5 = 0;
		int sum15 = 0;
		int count3 = 0;
		int count5 = 0;
		int count15 = 0;
		if (num1 <= num2) {
			for (int i = num1; i <= num2; i++) {
				if (i % 3 == 0) {
					sum3 += i;
					count3++;
				} else if (i % 5 == 0) {
					sum5 += i;
					count5++;
				} else if (i % 15 == 0) {
					sum15 += i;
					count15++;
				}
			}
			System.out.println("sum : " + (sum3 + sum5 - sum15));
			System.out.printf("avg : %.1f", ((double) (sum3 + sum5 - sum15) / (count3 + count5 - count15)));
		}

		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				if (i % 3 == 0) {
					sum3 += i;
					count3++;
				} else if (i % 5 == 0) {
					sum5 += i;
					count5++;
				} else if (i % 15 == 0) {
					sum15 += i;
					count15++;
				}
			}
			System.out.println("sum : " + (sum3 + sum5 - sum15));
			System.out.printf("avg : %.1f", ((double) (sum3 + sum5 - sum15) / (count3 + count5 - count15)));
		}

	}

}
