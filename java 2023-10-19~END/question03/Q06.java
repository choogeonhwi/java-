package question03;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a;

		while (true) {

			System.out.print(">>");

			a = scanner.next();

			if (a.equals("exit")) {
				break;
			}

		}
		System.out.println("종료합니다");
	}
}
