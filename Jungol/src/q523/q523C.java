package q523;

import java.util.Scanner;

public class q523C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		System.out.print(n1 + " > " + n2 + " --- ");
		int r = (n1 > n2) ? 1 : 0;
		System.out.println(r);

		System.out.print(n1 + " < " + n2 + " --- ");
		r = (n1 < n2) ? 1 : 0;
		System.out.println(r);

		System.out.print(n1 + " >= " + n2 + " --- ");
		r = (n1 >= n2) ? 1 : 0;
		System.out.println(r);

		System.out.print(n1 + " <= " + n2 + " --- ");
		r = (n1 <= n2) ? 1 : 0;
		System.out.println(r);

	}

}
