package chapter02;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		System.out.println("입력");
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();

		if (a % 3 == 0) {
			System.out.println("3배수");
		} else {
			System.out.println("아님");
		}
		scanner.close();

	}
}
