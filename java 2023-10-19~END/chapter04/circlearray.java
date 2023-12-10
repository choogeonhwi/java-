package chapter04;

import chapter03.returnarray;

class circle3 {
	int r;

	public double ga() {

		return 3.14 * r * r;
	}

	public circle3(int r) {
		this.r = r;
	}
}

public class circlearray {

	public static void main(String[] args) {
		circle3[] c;// 객체 배열 선언
		c = new circle3[5];

		for (int i = 0; i < c.length; i++) {
			c[i] = new circle3(i);
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].ga());
		}
	}
}
