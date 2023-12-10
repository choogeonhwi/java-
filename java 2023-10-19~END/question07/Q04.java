package question07;

import java.util.Scanner;

class a {
	int d;
	int u;
	int h;

	public a(int a, int b, int c) {
		this.d = a;
		this.u = b;
		this.h = c;
	}

	public int x() {
		return ((d + u) * h) / 2;
	}

}

public class Q04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");

		int a, b, c;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		a A = new a(a, b, c);
		// (윗변의 길이 + 아랫변의 길이) X높이 ÷ 2
		System.out.println("사다리 꼴의 면적은?" + (double) A.x());
	}
}
