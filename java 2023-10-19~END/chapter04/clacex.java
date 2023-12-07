package chapter04;

import chapter03.returnarray;

class calc {
	public static int abs(int a) {
		return a > 0 ? a : -a; // 절대값
	}

	static int max(int a, int b) {
		return a > b ? a : b; // 큰수
	}

	public static int min(int a, int b) {
		return a > b ? b : a; // 작은수
	}
}

public class clacex {
	public static void main(String[] args) {
		System.out.println(calc.abs(-6));
		System.out.println(calc.max(7, 8));
		System.out.println(calc.min(-6, -5));
	}
}
