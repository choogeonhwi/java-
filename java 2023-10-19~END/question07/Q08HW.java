package question07;

import java.util.Random;
import java.util.Scanner;

public class Q08HW {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = "";
		String b = "";
		int d = 0;
		Random R = new Random();

		for (int i = 0; i < 1000; i++) {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보!>>");
			a = scanner.next();
			d = R.nextInt(3);

			if (a.equals("가위") && d == 0) {
				b = "가위";
				System.out.println("사용자는 = " + a + ", " + "컴퓨터는 = " + b + ", " + "비겼습니다");
			}
			if (a.equals("가위") && d == 1) {
				b = "바위";
				System.out.println("사용자는 = " + a + ", " + "컴퓨터는 = " + b + ", " + "컴퓨터가 이겼습니다.");
			}
			if (a.equals("가위") && d == 2) {
				b = "보";
				System.out.println("사용자는 = " + a + ", " + "컴퓨터는 = " + b + ", " + "사용자가 이겼습니다.");
			}

			///////////////////////////////////////////////////////////////////////////

			if (a.equals("바위") && d == 0) {
				b = "가위";
				System.out.println("사용자는 = " + a + ", " + "컴퓨터는 = " + b + ", " + "사용자가 이겼습니다.");
			}
			if (a.equals("바위") && d == 1) {
				b = "바위";
				System.out.println("사용자는 = " + a + ", " + "컴퓨터는 = " + b + ", " + "비겼습니다.");
			}
			if (a.equals("바위") && d == 2) {
				b = "보";
				System.out.println("사용자는 = " + a + ", " + "컴퓨터는 = " + b + ", " + "컴퓨터가 이겼습니다.");
			}
			////////////////////////////////////////////////////////////////////////////

			if (a.equals("보") && d == 0) {
				b = "가위";
				System.out.println("사용자는 = " + a + ", " + "컴퓨터는 = " + b + ", " + "컴퓨터가 이겼습니다.");
			}
			if (a.equals("보") && d == 1) {
				b = "바위";
				System.out.println("사용자는 = " + a + ", " + "컴퓨터는 = " + b + ", " + "사용자가 이겼습니다.");
			}
			if (a.equals("보") && d == 2) {
				b = "보";
				System.out.println("사용자는 = " + a + ", " + "컴퓨터는 = " + b + ", " + "비겼습니다.");
			}
			if (a.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}

		}

	}
}
