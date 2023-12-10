package chapter06;

public class wraooerEx {
	public static void main(String[] args) {
		char c1 = '4', c2 = 'F';

		// character wrapper 클래스
		// isdigit 숫자체크하는 메소드
		if (Character.isDigit(c1)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자아님");
		}
		if (Character.isDigit(c2)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자아님");
		}
		if (Character.isAlphabetic(c2)) {
			System.out.println("영문자");
		} else {
			System.out.println("영문자 아님");
		}
		if (Character.isAlphabetic(c1)) {
			System.out.println("영문자");
		} else {
			System.out.println("영문자 아님");
		}

		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));

		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());

		System.out.println(Double.parseDouble("3.14"));
		boolean b = (4 > 3);
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));

	}
}
