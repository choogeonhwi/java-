package question01;

import java.util.Scanner;

public class question01 {
	public static void main(String[] args) {

		System.out.println("반지름, 원의 면적");
		Scanner scanner = new Scanner(System.in);

		double r = scanner.nextDouble();
		System.out.println("반지름=" + r);

		System.out.println("원의 면적=" + r * r * 3.14);

		scanner.close();
	}
}
