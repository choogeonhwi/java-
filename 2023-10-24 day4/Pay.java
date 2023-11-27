package chapter02;

import java.util.Scanner;

public class Pay {
	public static void main(String[] args) {
		final int RATE = 10000; // 시급
		int hour;
		double pay;
		System.out.println("시간은?");
		Scanner scanner = new Scanner(System.in);
		hour = scanner.nextInt();

		// 8H초과 시급*시간*1.5
		if (hour > 8) {
			pay = (RATE * 8 + (RATE * (hour - 8) * 1.5));
		} else {
			pay = RATE * hour;

		}
		System.out.println("급여는" + pay + "입니다.");

	}
}
