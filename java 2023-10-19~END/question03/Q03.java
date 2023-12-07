package question03;

public class Q03 {
	public static void main(String[] args) {
		int a = 0;
		for (int i = 1; i <= 10; i++) {
			a += i;
			if (i <= 9) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=" + a);
			}
		}
	}
}
