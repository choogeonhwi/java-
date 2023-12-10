package question03;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("부정행위여부:");
		String c = Scanner.next();

		System.out.println("출석:");
		int a = Scanner.nextInt();
		System.out.println("총점:");
		int t = Scanner.nextInt();
		char g = 65;

		for (int i = 0; i < 5; i++) {

			System.out.println(g);
			g++;

		}

		if (c.equals("true")) {
			System.out.println("F");
		} else if (c.equals("false") && a < 80) {
			System.out.println("F");
		} else if (c.equals("false") && a >= 80 && t >= 90) {
			System.out.println("A");
		} else if (c.equals("false") && a >= 80 && t >= 80) {
			System.out.println("B");
		} else if (c.equals("false") && a >= 80 && t >= 70) {
			System.out.println("C");
		} else if (c.equals("false") && a >= 80 && t >= 60) {
			System.out.println("D");
		} else {

			System.out.println("F");
		}
	}
}
