package chapter10;

public class threadmainEx {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();// 실행중 스레드 이름
		long id = Thread.currentThread().getId(); // 현재 실행중인 스레드의 고유 번호
		int priority = Thread.currentThread().getPriority();
		// 실행중 우선순위
		Thread.State s = Thread.currentThread().getState(); // 실행중 스레드 상태

		System.out.println("이름" + name);
		System.out.println("번호" + id);
		System.out.println("우선" + priority);
		System.out.println("상태" + s);
//		이름main
//		번호1
//		우선5
//		상태RUNNABLE

	}

}
