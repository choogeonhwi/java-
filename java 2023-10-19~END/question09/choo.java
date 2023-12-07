package question09;

import java.util.ArrayList;
import java.util.Scanner;

public class choo {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		int b = 0;
		String c = "";

		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int i = -1;
			i++;
			System.out.print("한글 단어?");
			a.add(i, scanner.next());
			c = a.get(i);

			switch (c) {
			case "사랑":
				System.out.println(c + "은 " + "love");
				break;
			case "아기":
				System.out.println(c + "은 " + "baby");
				break;
			case "돈":
				System.out.println(c + "은 " + "money");
				break;
			case "미래":
				System.out.println(c + "은 " + "future");
				break;
			case "희망":
				System.out.println(c + "은 " + "hope");
				break;
			case "그만":
				b = 1;
				System.out.println("종료합니다");
				break;
			default:
				System.out.println(c + "는 저의 사전에 없습니다.");
				break;

			}
			if (b == 1) {
				break;
			}

		}

	}
}