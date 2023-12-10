package chapter03;

public class NumFormatEXC {
	public static void main(String[] args) {
		// String[] stringsnumber= {"23","12","2","998"};
		String[] stringsnumber = { "23", "12", "3.141592", "998" };

		int i;

		for (i = 0; i < stringsnumber.length; i++) {
			// String j=stringsnumber[i];

			try {
				int j = Integer.parseInt(stringsnumber[i]);
				System.out.println("숫자로 변환된 값" + j);

			} catch (Exception e) {
				System.out.println(stringsnumber[i] + "변환할 수 없다");
			}

		}

	}
}
