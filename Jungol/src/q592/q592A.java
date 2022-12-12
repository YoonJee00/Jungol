package q592;

import java.util.Scanner;

public class q592A {
	public int powSum(int p) {
		int d = p % 10;
		if (p % 10 > 0)
			return (d * d) + powSum(p / 10);
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		q592A m = new q592A();
		int ret = m.powSum(inp);
		System.out.println(ret);
	}
}
