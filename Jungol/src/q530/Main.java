package q530;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		
		int old = 20 - age;
		
		if (age > 20) {
			System.out.println("adult");
		} else {
			System.out.print(old);
			System.out.println(" years later");
		}

	}

}
