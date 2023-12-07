package question06;

//평가문제 추건휘
public class UI3 {
	public static void main(String[] args) {
		for (int i = 1; i < 30; i++) {

			if (i == 3 || i == 6 || i == 9 | i == 13 || i == 16 || i == 19 | i == 23 || i == 26 || i == 29) {
				System.out.println(i + "박수한번");
			}
		}

		for (int j = 30; j < 100; j++) {

			if ((j % 3 != 0 || j == 30) && j < 40) {
				System.out.println(j + "박수한번");
			}
			if (j == 33 || j == 36 || j == 39) {
				System.out.println(j + "박수두번");
			}

			if (j == 43 || j == 46 || j == 49 || j == 53 || j == 56 || j == 59) {
				System.out.println(j + "박수한번");
			}
			if ((j == 60 || j % 3 != 0) && (j < 70 && j >= 60)) {
				System.out.println(j + "박수한번");
			}

			if (j == 63 || j == 66 || j == 69) {
				System.out.println(j + "박수두번");
			}
			if (j == 73 || j == 76 || j == 79 || j == 83 || j == 86 || j == 89) {
				System.out.println(j + "박수한번");
			}
			if ((j % 3 != 0 || j == 90) && j >= 90) {
				System.out.println(j + "박수한번");
			}
			if (j == 93 || j == 96 || j == 99) {
				System.out.println(j + "박수두번");
			}

		}
	}
}