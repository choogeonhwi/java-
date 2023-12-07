package question06;

public class Q04 {
	public static void main(String[] args) {
		int a[][] = new int[120][5];
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = (i + 1) * 100 + j + 1;
				sum += a[i][j];
			}
		}
		System.out.println("10년간 5개 나라의 총 신생아수는" + sum);
	}
}
