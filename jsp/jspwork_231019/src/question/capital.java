package question;

public class capital {
	private String a;

	public String p() {
		StringBuffer s = new StringBuffer();
		char c = 'a';
		char c2 = a.charAt(0);

		for (char i = c2; i >= c; i--) {

			for (char j = 0; j <= i; j++) {
				s.append(j);
			}

			s.append("<br>");
		}
		return s.toString();
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
}
