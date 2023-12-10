package question;

public class Arithmetic {
	private int a;
	private String c;
	private int b;

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String abc(int a, String c, int b) {
		String r = "";
		int re = 0;
		switch (c) {
		case "+":
			re = a + b;
			break;
		case "-":

			re = a - b;
			break;
		case "*":

			re = a * b;
			break;
		case "/":

			if (b != 0) {
				re = a / b;
			} else {
				return r = "나눌 수 없습니다";
			}

			break;

		default:

			return r = "사칙연산이 아닙니다";

		}

		r = a + c + b + "의 계산 결과는" + re;
		return r;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
