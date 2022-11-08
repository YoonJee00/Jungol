package q557;

import java.util.Scanner;

public class q557A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a[] = new char[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);
		}
		
		System.out.printf("%c %c %c", a[0], a[3], a[6]);

	}

}
