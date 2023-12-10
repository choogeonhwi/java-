package question07;

import java.util.Scanner;

import chapter06.equalsEx;

class a2 {
	int a, b;

	public a2(int ac, int bc) {
		a = ac;
		b = bc;
	}

	int cc() {
		return a + b;

	}

}

class s2 {
	int a, b;

	public s2(int ac, int bc) {
		a = ac;
		b = bc;
	}

	int cc() {
		return a - b;

	}
}

class m2 {
	int a, b;

	public m2(int ac, int bc) {
		a = ac;
		b = bc;
	}

	int cc() {
		return a * b;

	}
}

class d2 {
	int a, b;

	public d2(int ac, int bc) {
		a = ac;
		b = bc;
	}

	int cc() {
		return a / b;

	}
}

public class Q13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");

		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		String v2 = scanner.next();

		a2 a = new a2(x1, x2);
		s2 s = new s2(x1, x2);
		m2 m = new m2(x1, x2);
		d2 d = new d2(x1, x2);

		if (v2.equals("+")) {
			System.out.println(a.cc());
		}
		if (v2.equals("-")) {
			System.out.println(s.cc());
		}
		if (v2.equals("*")) {
			System.out.println(m.cc());
		}
		if (v2.equals("/")) {
			System.out.println(d.cc());
		}
		scanner.close();

	}
}
