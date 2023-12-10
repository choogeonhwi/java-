package chapter051;

import chapter04.staticmember;

public class Main {
	public static void main(String[] args) {

		penguin p = new penguin();
		p.swim(); // 5개 멤버 수영

		bird p2 = new penguin(); // 업캐스팅
		p2.walk();
		penguin p3 = (penguin) p2;
		p3.swim();

		bird d = new duck1(); // 업캐스팅
		d.eat();
		duck1 d2 = (duck1) d;
		d2.fly();

		animal d3 = new duck1(); // 업캐스팅
		int x = d3.life;
		System.out.println(x);

		swim2 s = new penguin();
		s.swim();

		swim2[] s2 = new swim2[2]; // 객체 배열 비슷
		s2[0] = new penguin();
		s2[1] = new duck1();
		s2[0].swim();
		s2[1].swim();
//	s2[2].swim(); // 컴파일 단계에서 알수없고 런타임 시 오류
		// java.lang.arrayindexoutofboundsexception:2

//	s2[1].fly(); // swim2에 추상메소드 추가시 기능

//	s2[2] = new penguin()//오류
	}

}
