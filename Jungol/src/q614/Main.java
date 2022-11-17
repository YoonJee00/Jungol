package q614;

import java.util.Scanner;

class student {
	private String school;
	private int grade;
	
	public student(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.printf("%d grade in %s School\n", grade, school);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		student stu = new student(school, grade);
		stu.print();

	}
}
