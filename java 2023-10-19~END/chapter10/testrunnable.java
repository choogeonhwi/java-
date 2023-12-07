package chapter10;

public class testrunnable {
	public static void main(String[] args) {
		Thread th = new Thread(new runnable());
		th.start();
	}
}
