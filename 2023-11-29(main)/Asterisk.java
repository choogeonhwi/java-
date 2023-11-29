package question;

public class Asterisk {
	int a;

	public String p(int a) {
		StringBuffer s = new StringBuffer();
		for (int i = a; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				s.append('*');
			}
			s.append("<br>");
		}
		return s.toString();

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
