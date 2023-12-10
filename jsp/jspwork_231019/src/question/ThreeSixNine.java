package question;

public class ThreeSixNine {
	int a;

	public String p(int a) {
		String b = "";
		int c = 0;
		c = a / 10;

		if (a == 36 || a == 33 || a == 39 || a == 63 || a == 66 || a == 69 || a == 93 || a == 96 || a == 99) {
			return b = "박수짝짝";
		}
		if (a != 0 && a % 3 == 0) {

			if (c % 3 == 0) {
				return b = "박수짝";
			}

			else if (a > 10) {
				return b = "박수짝";
			}
		}

		else {
			return b = "박수없음";
		}

		return b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
