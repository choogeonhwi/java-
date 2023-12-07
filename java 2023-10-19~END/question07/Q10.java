package question07;

import java.util.Scanner;

class P {
	String lastN;
	String firsN;

	public P(String i, String f) {
		lastN = i;
		firsN = f;
	}

	public String getL() {
		return lastN;
	}

	public String getF() {

		return firsN;
	}

	public String getLe() {
		return lastN + firsN.length();
	}
}

public class Q10 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String f = "";
		String i = "";

		System.out.print("성을 입력하세요");
		i = scanner.next();
		System.out.print("이름을 입력하세요");
		f = scanner.next();
		P p1 = new P(i, f);
		System.out.println("성: " + p1.getL() + " 이름: " + p1.getF() + " 길이: " + getLe());

		System.out.print("성을 입력하세요");
		i = scanner.next();
		System.out.print("이름을 입력하세요");
		f = scanner.next();
		P p2 = new P(i, f);
		System.out.println("성: " + p2.getL() + " 이름: " + p2.getF());
	}

	private static String getLe() {
		// TODO Auto-generated method stub
		return null;
	}
}
