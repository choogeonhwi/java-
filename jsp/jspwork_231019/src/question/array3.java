package question;

import java.util.Random;

public class array3 {
	int a;

//	public String p() {
//		Random r = new Random();
//		int[] b = new int[a];
//		StringBuffer s = new StringBuffer();
//
//		for (int i = 0; i < a; i++) {
//			int m = r.nextInt(100);
//			b[i] = m;
//			if (i % 10 == 0) {
//				s.append(b[i] + "\t");
//
//			} else {
//				s.append(b[i] + "\t");
//
//			}
//		}
//		return s.toString();
//
//	}
	public String p() {
		Random r = new Random();
		int b[] = new int[a];
		StringBuffer s = new StringBuffer();

		for (int i = 1; i < a; i++) {
			b[i] = r.nextInt(100);
			s.append(b[i] + "\t");

			if (i % 10 == 0) {
				s.append("<br>");
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
