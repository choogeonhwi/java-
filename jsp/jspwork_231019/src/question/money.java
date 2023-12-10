package question;

public class money {
	int a;

	public String p(int a) {
		int b = 0;
		int c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;

		if (a > 50000) {
			h = a / 50000;
		}
		if (a > 10000) {
			c = a % 50000;
			c = c / 10000;
		}
		if (a > 1000) {
			d = a % 10000;
			d = d / 1000;
		}
		if (a > 100) {
			e = a % 1000;
			e = e / 100;
		}
		if (a > 10) {
			f = a % 100;
			f = f / 10;
		}
		if (a > 1) {
			g = a % 10;
			g = g / 1;
		}
		return "5만원" + h + "<br>" + "1만원" + c + "<br>" + "1000원" + d + "<br>" + "100원" + e + "<br>" + "10원" + f + "<br>"
				+ "1원" + g + "<br>";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
