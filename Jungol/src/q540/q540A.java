package q540;

import java.util.Scanner;

public class q540A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int inp = sc.nextInt();

			if (inp == -1) {
				break;
			} else if (inp % 3 == 0) {
				int ret = inp / 3;
				System.out.println(ret);
			}
//				else if (inp % 3 != 0) {
//
//			}
		}
		sc.close();
	}
}
