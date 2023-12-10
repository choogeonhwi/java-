package question06;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = "";
		String b[] = { "a", "b", "c", "d", "e" };
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		a = scanner.next();

		if (a.equals("e")) {
			for (int i = 5; i > 0; i--) {

				for (int j = 0; j < i; j++) {
					System.out.print(b[j]);
				}
				System.out.println();
			}
		} else {
			scanner.close();
		}
//		if(a.equals("a")) {
//			System.out.println(b[j]);
//		} else if (a.equals("b")) {
//			System.out.println(b[j]);
//		} else if (a.equals("c")) {
//			System.out.println(b[j]);
//		} else if (a.equals("d")) {
//			System.out.println(b[j]);
//		} else 

	}
}
