package question;

public class DAR {
	private int a;

	public int getA() {

		return a;

	}

	public String p(int i) {
		String r = "";
		int t = i / 10;
		int o = i % 10;

		if (t == o) {
			r = "10의 자리와 1의 자리가 같다";
		} else {
			r = "다르다";
		}
		return r;
	}

	public void setA(int a) {

		this.a = a;

	}
}
