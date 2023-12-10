package question03;

public class Q07 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		do {

			a += 2;
			b += a;

		} while (a < 98);
		System.out.println(b);

	}
}
