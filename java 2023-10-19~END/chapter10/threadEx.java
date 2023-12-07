package chapter10;

class threadEx1 extends Thread {
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}

class threadEx2 implements Runnable {
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 10; j < 15; j++) {
			System.out.println(j);
		}
	}
}

public class threadEx {
	public static void main(String[] args) {
		threadEx1 t1 = new threadEx1();
//		Thread t2 = new Thread(new threadEx2());
		Runnable r = new threadEx2();
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}
