package chapter02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {

		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 비낰능로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);// 바이트 표준 입력 스트림, 매개변수(인자/파라미터/argument),
		// 객체생성(new~)
		// 참조변수
		// 스캐너 객체 생성/ 스캐너 클래스 타입의 스캐너 참조변수가 가리킴
		String name = scanner.next();// 문자열 입력 받는 메소드
		System.out.println("이름은 " + name);

		String city = scanner.next();
		System.out.println("도시는= " + city);

		int age = scanner.nextInt();

		System.out.println("나이는 " + age + " 살");

		double weight = scanner.nextDouble();
		System.out.println("몸무게는 " + weight + " kg");

		boolean single = scanner.nextBoolean();
		System.out.println("독신여부는 " + single + " 입니다.");

		scanner.close();// garbage collector가 알아서 정리하지만 선언을 추천

	}
}
