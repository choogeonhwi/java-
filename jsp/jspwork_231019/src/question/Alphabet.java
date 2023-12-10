package question;

public class Alphabet {
	String a;

	public String p() {
		StringBuffer s = new StringBuffer();
		char c = 'a';
		char c2 = s.charAt(0);
		do {
			s.append(c);
			c = (char) (c + 1);
		} while (c <= c2);
		System.out.println(s.toString());
		return s.toString();
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

}
