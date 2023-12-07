package question02;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int income = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("요금을 입력하세요>>");
			int fare = scanner.nextInt();
			income += fare;

		}
		System.out.println(income);
		scanner.close();

	}
}
