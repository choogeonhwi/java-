package chapter06;

class point2 {
	private int x, y;

	public point2(int x, int y) {
		this.x = x;
		this.y = y;

	}
//	point2(2,3)
//	point2(2,3)
//	point2(2,3)입니다

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "point2(" + x + "," + y + ")";
	}
}

public class toStringEx {
	public static void main(String[] args) {
		point2 p = new point2(2, 3);
		System.out.println(p); // chapter06.point2@15db9742 패키지 클래스 16진수 해시코드
		System.out.println(p.toString());
		System.out.println(p.toString() + "입니다");

	}
}
