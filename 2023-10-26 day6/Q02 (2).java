package question03;

public class Q02 {
	public static void main(String[] args) {
		int d = 0;
		int f = 0;

		for (int i = 1; i < 10; i++) {
			d = +i;

			for (int j = 1; j < 10; j++) {
				f = +j;
				System.out.print(d + "*" + f + "=" + d * f + "\t");
			}
			System.out.println(); // 줄바꿈
		}
	}
}
