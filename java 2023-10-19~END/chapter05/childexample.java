package chapter05;

import chapter04.staticmember;

public class childexample {
	public static void main(String[] args) {
//	parent 클래스에 기본 생성자를 만들어 호출하고, child 클래스에 기본생성자 만들어 호출
		parent parent = new child();
//	parent.filed2="data2"; 오류
		parent.m1();
		parent.m2();
//    parent.m3(); //오류
		child child = (child) parent; // down 캐스팅
		child.filed2 = "yyy"; // 서브클래스 멤버 접근 가능
		child.m3();
	}
}
