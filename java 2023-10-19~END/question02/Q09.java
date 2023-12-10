package question02;

import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		System.out.print("매수금액을 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		double b = scanner.nextInt();

		System.out.print("매도금액을 입력하세요>>");
		double s = scanner.nextInt();

		if (b < s) {
			System.out.println("양도세:" + (s - b) * 0.22);
		} else if (b >= s) {
			System.out.println("양도세:0.0원입니다");
		}
		scanner.close();
	}
}
