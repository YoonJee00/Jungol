package q633;

import java.util.Scanner;

public class q633A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inp; //do 안쪽에서 선언하면 while문에 적용 x
		do {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			System.out.println();
			inp = sc.nextInt();
			
			if(inp == 1) {
				System.out.println("Seoul");
			} else if(inp == 2) {
				System.out.println("Washington");
			} else if(inp == 3) {
				System.out.println("Tokyo");
			} else if(inp == 4) {
				System.out.println("Beijing");
			}
		} while(1 <= inp && inp <= 4);
		sc.close();
		System.out.println("none");

	}

}
