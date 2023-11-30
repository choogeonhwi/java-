package question03;

public class Q04 {
	public static void main(String[] args) {

		int z = 0;

		for (int i = 1; i < 11; i++) {
			z = +i;

			if (z % 3 == 0) {
				// System.out.println("1 2 짝 4 5 짝 7 8 짝 10");
				System.out.print("짝");

			} else {
				System.out.print(z + "");
			}
		}
	}

}
