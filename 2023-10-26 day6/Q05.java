package question02;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		System.out.print("지수 입력>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.print("환율 입력>>");
		int b = scanner.nextInt();

		if (b >= 1150 && a >= 2200) {
			System.out.print("상승장");
		} else if (b >= 1150 && a >= 2000) {
			System.out.print("횡보장");
		} else if (b < 1150 && a >= 2300) {
			System.out.print("상승장");
		} else if (b < 1150 && a >= 2000) {
			System.out.print("횡보장");
		} else if (a < 2000) {
			System.out.print("하락장");
		}
		scanner.close();
	}
}
