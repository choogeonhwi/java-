package question02;

public class Q01 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		while (a < 99) {

			a += 2;
			b += a;
		}
		System.out.println(b - 100);
	}
}
