package chapter03;

public class throwsexample {
	public static void main(String[] args) {
		try {
			findclass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("클래스없어요");
		}
	}

	public static void findclass() throws ClassNotFoundException {
		// public static void findclass() {
		Class.forName("A");
		// 메소드 호출한 곳으로 예외 처리를 넘김
		/*
		 * try { //Class.forName("java.lang.String");
		 * Class.forName("java.lang.String2"); } catch (ClassNotFoundException e) { //
		 * 예외 발생시 출력되는 기본메시지 e.printStackTrace(); }
		 */
	}
}
