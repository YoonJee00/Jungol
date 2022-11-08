package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = " ";
		char a[] = new char[10];

		for (int i = 0; i < a.length; i++) {
			str = sc.next();
			a[i] = str.charAt(0);
		}
		sc.close();
		System.out.printf("%s %s %s", a[0], a[3], a[6]);
	}

}
