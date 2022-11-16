package q105;

public class q105A {

	public static void main(String[] args) {
		String[] str = { "Seoul", "10,312,545", "+91,375", "Pusan", "3,567,910", "+5,868", "Incheon", "2,758,296",
				"+64,888", "Daegu", "2,511,676", "+17,230", "Gwangju", "1,454,636", "+29,774" };
		for (int i = 0; i < str.length; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println();
			}
			System.out.printf("%15s", str[i]);
		}
	}
}
