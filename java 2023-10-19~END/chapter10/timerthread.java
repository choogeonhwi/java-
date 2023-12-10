package chapter10;

public class timerthread extends Thread {

	int n = 0;

	public void run() {
		while (true) {
			System.out.println();
			n++;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// 예외 처리 기본 메시지 출력
			}

		}

	}
}
