package chapter04;

import java.util.Scanner;
import java.util.Set;

class cc {// getter,setter 메소드로 접근
//접근지정자
	private static double rate; // 멤버변수는 보안문제로 가두리

	public static void sr(double rate) {
		cc.rate = rate;
	}

	public static double td(double won) {
		return won / rate;
	}

	public static double tk(double dollar) {
		return rate * dollar;
	}

}

public class staticmember {
	static int a;
	static int b;

	public static void main(String[] args) {
		// 환율 입력받아 100만원 몇달러
		Scanner scanner = new Scanner(System.in);
		System.out.println("환율>>");
		double rate = scanner.nextDouble();
		cc.sr(rate);
		System.out.println("백만원은 " + cc.td(1000000) + "$입니다");
		System.out.println("100$는 " + cc.tk(100) + "원입니다");
	}
}
