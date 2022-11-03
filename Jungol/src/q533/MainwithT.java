package q533;

import java.util.Scanner;

public class MainwithT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int age = sc.nextInt();
		sc.close();
		
//		System.out.println(c + " " + age);
		
		if (c == 'M') {
			if (age >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else {
			if (age >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		}
		
	}	
}
