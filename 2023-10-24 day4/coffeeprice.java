package chapter02;

import java.util.Scanner;

public class coffeeprice {
	public static void main(String[] args) {
		System.out.println("뭔 커피?");
		Scanner scanner = new Scanner(System.in);

		String order = scanner.next();// 문자열을 입력받음
		int price = 0;

		switch (order) {
		case "카푸치노":
		case "에스프레소":
		case "카페라떼":
			price = 3500;
			break;
		case "아아":
			price = 2000;
			break;

		default:
			System.out.println("메뉴 없습니다");
			break;
		}
		if (price != 0) {

			System.out.println(order + price); // order의 값이 강제로 출력되어 (xxx+가격생략) if처리가 필요함
		}
		scanner.close();
	}
}
