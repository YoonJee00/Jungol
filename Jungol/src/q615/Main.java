package q615;

import java.util.Scanner;

class Student {
	private String name;
	private int kr;
	private int eng;

	public Student(String name, int kr, int eng) {
		this.name = name;
		this.kr = kr;
		this.eng = eng;
	}

	public void print() {
		System.out.println(name + " " + kr + " " + eng);
	}

	public int getKr() {
		return kr;
	}

	public int getEng() {
		return eng;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[2];
		for (int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int kr = sc.nextInt();
			int eng = sc.nextInt();
			stu[i] = new Student(name, kr, eng);
		}
		sc.close();
		for (int i = 0; i < stu.length; i++) {
			stu[i].print();
		}

		int sumKr = 0, sumEng = 0;
		for (int i = 0; i < stu.length; i++) {
			sumKr += stu[i].getKr();
			sumEng += stu[i].getEng();
		}
		System.out.println("avg " + sumKr / stu.length + " " + sumEng / stu.length);
	}

}
