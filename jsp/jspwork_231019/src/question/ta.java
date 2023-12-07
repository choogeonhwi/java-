package question;

import java.util.Random;

public class ta {
	int a;

	public String p() {
		StringBuffer s = new StringBuffer();
		Random r = new Random();

		int b[][] = new int[a][a];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = r.nextInt(10) + 1;
				s.append(b[i][j] + "\t");
				if (j == a - 1) {
					s.append("<br>");
				}
			}

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
