package chapter03;

import java.util.Scanner;
import java.util.concurrent.Delayed;

public class loopex3 {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;

		System.out.println("정수 입력 마지막-1 입력");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		while (n != -1) {
			// sum = sum+n;
			sum += n;
			count++;
			n = scanner.nextInt();
		}
		if (count == 0) {
			System.out.println("입력없다");
		} else {
			System.out.println("갯수는" + count + "개");
			System.out.println("갯수는" + (double) sum / count + "개");
		}
		scanner.close();
	}
}
