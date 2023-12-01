package chapter03;

public class ex310 {
	public static void main(String[] args) {
		double s[][] = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };

		double sum = 0;

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				sum += s[i][j];
				// 배열 ~3,1

			}
		}
		int n = s.length;
		int m = s[0].length;

		System.out.println("4년 평평" + sum / (n * m));
	}
}
