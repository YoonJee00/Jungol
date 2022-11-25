package q170;

public class q170A {
	public void printAt() {
		for (int i = 0; i <= 9; i++) {
			System.out.print("@");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		q170A m = new q170A();

		// 1st
		System.out.println("first");
		m.printAt();
		System.out.println("second");
		m.printAt();
		System.out.println("third");
		m.printAt();

		// 2nd
		String[] str = { "first", "second", "third" };
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			m.printAt();
		}

	}

}
