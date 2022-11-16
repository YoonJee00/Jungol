package q613;

import java.util.Scanner;

class Student1 {
	private String name;
	private String school;
	private int grade;

	public Student1(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}
}

public class q613A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student1 stu = new Student1(name, school, grade);
		stu.print();
	}

}
