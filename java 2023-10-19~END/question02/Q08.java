package question02;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		System.out.print("구매 금액을 입력>>");
		Scanner scanner = new Scanner(System.in);

		long p = scanner.nextInt();

		if (p >= 300000) {
			System.out.println("구매금액:" + p);
			System.out.println("청구금액:" + (p - 30000));
		} else if (p >= 100000 && p < 300000) {
			System.out.println("구매금액:" + p);
			System.out.println("청구금액:" + (p - 5000));
		} else if (p < 100000) {
			System.out.println("구매금액:" + p);
			System.out.println("청구금액:" + p);
		}
		scanner.close();
	}
}
