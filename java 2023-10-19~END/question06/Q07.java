package question06;

import java.util.Random;

public class Q07 {
	public static void main(String[] args) {

		Random r = new Random();
		int a = 0;

		for (int i = 0; i < 1000; i++) {

			a = r.nextInt(11);
			System.out.println(a);
			if (a == 7) {

				break;
			}
		}

	}
}