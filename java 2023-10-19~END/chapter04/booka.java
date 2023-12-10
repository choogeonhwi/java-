package chapter04;

import java.util.Scanner;

import chapter03.calc;

class book3 {
	String t;
	String a;

	public book3(String t, String a) {
		this.t = t;
		this.a = a;
	}
}

public class booka {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 참조변수가 2개를 가리킴
		book3[] book = new book3[2];

		for (int i = 0; i < book.length; i++) {
			System.out.print("제목>>");
			String t = scanner.nextLine(); // 입력값을 한 행을 받고 엔터
			System.out.print("저자>>");
			String a = scanner.nextLine();
			book[i] = new book3(t, a); // 객체를 2번 생성

		}
		for (int i = 0; i < book.length; i++) {
			System.out.print("(" + book[i].t + "," + book[i].a + ")");
		}

	}
}
