package question02;

public class Q02 {
	public static void main(String[] args) {
		int a = 0;

		/*
		 * for (int i = 0; i <99; i++) { i +=1; a +=i;
		 * 
		 * }
		 */
		for (int i = 0; i < 99; i += 2) {
			a += i;
		}
		System.out.println(a);

	}
}
