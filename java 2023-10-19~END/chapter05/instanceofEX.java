package chapter05;

import java.util.stream.IntStream;

public class instanceofEX {
	public static void m1(parent parent) {
//	parent parent = new child(); child 객체 판단
//	instanceof 객체가 해당 클래스 타입 참거짓 판별
		if (parent instanceof child) {
			child child = (child) parent;
			// downCasting
			System.out.println("m1-child 변환성공");
//	parent parent = new child(); child 객체 판단
			//
		} else {
			System.out.println("m1-child 변환실패");

		}

	}

	public static void m2(parent parent) {
		child child = (child) parent;
		System.out.println("m2-child 변환성공");
	}

	public static void main(String[] args) {

		// 업캐스팅
		parent parentA = new child();
//	  m1(parentA);
		parent parentB = new parent();
//	  m1(parentB);
		m2(parentA);
//	  m2(parentB); 예외발생

	}
}
