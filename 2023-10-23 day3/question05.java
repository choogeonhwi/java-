package question01;

import java.util.Scanner;

public class question05 {
	public static void main(String[] args) {
		System.out.println("원화를 입력하세요");
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();

		System.out.println(a + "원은" + "$" + (a / 1100) + "입니다.");

		scanner.close();
	}
}
