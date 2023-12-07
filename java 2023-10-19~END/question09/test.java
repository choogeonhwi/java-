package question09;

public class test {
	public static void main(String[] args) {

		StringBuffer s = new StringBuffer();
		char c = 'a';
		char c2 = s.charAt(0);
		do {
			s.append(c);
			c = (char) (c + 1);
		} while (c <= c2);
		System.out.println(s.toString());

	}
}
