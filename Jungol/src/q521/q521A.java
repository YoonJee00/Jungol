package q521;

import java.util.Scanner;

public class q521A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

//		System.out.println(inp1 + " " + inp2);

		int res = inp1++ * --inp2;
		System.out.println(inp1 + " " + inp2 + " " + res);

	}

}
