package chapter03;

import java.util.Scanner;

public class dividebyzero {
	public static void main(String[] args) {
		// 나눗셈 몫을 출력
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;

		System.out.println("분자 입력");
		dividend = scanner.nextInt();
		System.out.println("분모 입력");
		divisor = scanner.nextInt();

//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at chapter03.dividebyzero.main(dividebyzero.java:19)
// 10/0=
		System.out.println(dividend + "를" + divisor + "로 나누면" + dividend / divisor + "입니다");
		scanner.close();
	}
}
