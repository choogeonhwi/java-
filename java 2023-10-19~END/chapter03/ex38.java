package chapter03;

public class ex38 {
	public static void main(String[] args) {
		int count = 0;
		String str = "programing is fun! right?";
		char[] chararr = str.toCharArray();

		for (int i = 0; i < chararr.length; i++) {
			if (chararr[i] == 'R' || chararr[i] == 'r') {

				count++;

			}
		}
		System.out.println(count);
	}
}
