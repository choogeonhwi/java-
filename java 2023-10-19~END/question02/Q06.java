package question02;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		System.out.print("연산 입력>>");
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		String c = scanner.next();
		int b = scanner.nextInt();

		if (c.equals("+")) {
			System.out.println(a + "+" + b + "의 계산 결과는" + (a + b));
		} else if (c.equals("-")) {
			System.out.println(a + "-" + b + "의 계산 결과는" + (a - b));
		} else if (c.equals("*")) {
			System.out.println(a + "*" + b + "의 계산 결과는" + (a * b));
		} else if (c.equals("/") && b == 0) {
			System.out.println("나눌 수 없다");
		} else if (c.equals("/")) {
			System.out.println(a + "/" + b + "의 계산 결과는" + (a / b));
		}

	}
}
