package question05;

import java.util.Scanner;

public class UI2 {
	public static void main(String[] args) {
		String password = "myongji60";
		String input;
		int trynumber = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.print("압호를 입력하세요:");
			input = scanner.next();
			trynumber = trynumber + 1;

			if (input.equals("myongji60")) {
				System.out.println("환영합니다");
				break;
			} else if (trynumber == 3) {
				System.out.println("접속을 거부합니다");
			} else if (input != password) {
				System.out.println("암호가 틀립니다");
			}
		}

	}
}
