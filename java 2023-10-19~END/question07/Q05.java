package question07;

import chapter04.staticmember;

public class Q05 {
	public static void main(String[] args) {
		String a[] = { "to", "be", "or", "not", "to", "be" };
		printStringArray(a);
		System.out.println();
		replaceBe(a);

	}

	public static void printStringArray(String a[]) {
		String b = "";
		for (int i = 0; i < 6; i++) {
			b = a[i];
			System.out.print(b + " ");
		}

	}

	public static void replaceBe(String a[]) {
		String c = "";

		for (int i = 0; i < 6; i++) {
			c = a[i].replace("be", "eat");
			System.out.print(c + " ");
		}

	}
}
