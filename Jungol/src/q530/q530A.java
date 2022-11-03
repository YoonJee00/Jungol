package q530;

import java.util.Scanner;

public class q530A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		
		if (age >= 20) {
			System.out.println("adult");
		} else {
			int m = 20 - age;
//			System.out.println(m + " years later");
			System.out.printf("%d years later", m);
		}

	}

}
