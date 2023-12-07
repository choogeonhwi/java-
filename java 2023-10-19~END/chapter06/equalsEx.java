package chapter06;

import chapter03.returnarray;

class point3 {
	private int x, y;

	public point3(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@Override
	public boolean equals(Object obj) {
		point3 p = (point3) obj;
		if (x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}

public class equalsEx {
	public static void main(String[] args) {
		point3 a = new point3(2, 3);
		point3 b = new point3(2, 3);
		point3 c = new point3(2, 3);

		if (a == b) { // 객체 비교
			System.out.println("a == b");
		} else {
			System.out.println("a !=b");
		}
		if (a.equals(b)) {
			System.out.println(" a is equal to b");
		} else {
			System.out.println(" a is equal not to b");
		}
		if (a.equals(c)) {
			System.out.println(" a is equal to c");
		} else {
			System.out.println(" a is equal not to c");
		}
	}

}
