package q613;

import java.util.Scanner;

class student {
	String name;
	String school;
	int grade;
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student m = new student();

		m.name = sc.next();
		m.school = sc.next();
		m.grade = sc.nextInt();
		
		sc.close();
		System.out.println("Name : " + m.name);
		System.out.println("School : " + m.school);
		System.out.println("Grade : " + m.grade);

	}
}
