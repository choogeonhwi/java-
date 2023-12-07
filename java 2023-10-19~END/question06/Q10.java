package question06;

import java.util.Scanner;

class grade {
	int m;

	public grade(int d) {
		this.m = d;
	}

	public int av() {
		return this.m / 3;
	}
}

public class Q10 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("3과목 점수를 입력>>");
		int a, b, c, d = 0;

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = a + b + c;

		grade me = new grade(d);

		System.out.println("평균은" + me.av());
	}
}
