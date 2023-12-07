package chapter06;

class point {
	private int x, y;

	public point(int x, int y) {
		this.x = x;
		this.y = y;

	}
}

public class objectpropertyEx {
	public static void print(Object obj) {
//	System.out.println(obj.getClass().getName());//업캐스팅
		System.out.println(obj.hashCode()); // 366712642 객체의 서명(10진수 해시코드)
		System.out.println(obj.toString()); // 챕ㅌ어6포인ㄴ트@15db9747dml의 패키지 클래스 @ 16진수 해시코드
		System.out.println(obj); // 문자열 생략
	}

	public static void main(String[] args) {
		point p = new point(2, 3);
		print(p);
	}
}
