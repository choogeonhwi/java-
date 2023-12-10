package chapter05;

import chapter04.staticmember;

class person {
}

class student extends person {
}

class researcher extends person {
}

class professor extends researcher {
}

public class INSTANCEOFex2 {
	static void print(person p) {
//		person p = new student() 업캐스팅
		if (p instanceof person) { // p 객체가 사람 클래스 타입인지
			System.out.print("person "); // 참출력
		}
		if (p instanceof student) { // p 객체가 학생 클래스 타입인지
			System.out.print("student "); // 참출력
		}
		if (p instanceof researcher) { // p 객체가 연구노예 클래스 타입인지
			System.out.print("researcher "); // 참출력
		}
		if (p instanceof professor) { // p 객체가 교수 클래스 타입인지
			System.out.print("professor "); // 참출력
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new student()->\t");
		print(new student());
		System.out.print("new student()->\t");
		print(new researcher());
		System.out.print("new student()->\t");
		print(new professor());
	}
}
