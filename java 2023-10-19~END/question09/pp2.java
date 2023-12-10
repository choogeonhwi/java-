package question09;

import java.util.Scanner;

class calc {
	int a, b;

	void sv(int a, int b) {
		this.a = a;
		this.b = b;
	}

}

class a extends calc {

	int cl() {
		return a + b;
	}

}

class s extends calc {

	int cl() {
		return a - b;
	}
}

class m extends calc {

	int cl() {

		return a * b;
	}
}

class d extends calc {

	int cl() {
		return a / b;
	}
}

public class pp2 {
	public static void main(String[] args) {
		int z, x;
		String y;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수와 연산자 입력>>");
		z = scanner.nextInt();
		x = scanner.nextInt();
		y = scanner.next();
		a a = new a();
		s s = new s();
		m m = new m();
		d d = new d();

		a.sv(z, x);
		s.sv(z, x);
		m.sv(z, x);
		d.sv(z, x);

		if (y.equals("+")) {
			System.out.println(a.cl());
		}
		if (y.equals("-")) {
			System.out.println(s.cl());
		}
		if (y.equals("*")) {
			System.out.println(m.cl());
		}
		if (y.equals("/")) {
			System.out.println(d.cl());
		}

	}
}
