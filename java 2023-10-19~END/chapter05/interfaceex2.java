package chapter05;

interface phonelnterface2 {

	int TIMEOUT = 100;

	void sendcall();

	void receivecall();

	default void printlogo() {
		System.out.println("**phone**");

	}

}

interface MPIF extends phonelnterface2 {
	void sendSMS();

	void receiveSMS();
}

interface MP3 {
	void play();

	void stop();

}

// 여러기능의 상속
class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SP extends PDA implements MPIF, MP3 {

	@Override
	public void sendcall() {
		System.out.println("띠링");
	}

	@Override
	public void receivecall() {
		// TODO Auto-generated method stub
		System.out.println("전화 옴");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("연주합니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("멈춥니다");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 보냅니다");
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자 옴");
	}

	public void SC() {
		// TODO Auto-generated method stub
		System.out.println("일정관리");
	}

}

public class interfaceex2 {
	public static void main(String[] args) {
		SP p = new SP();
		p.printlogo();
		p.sendcall();
		p.play();
		System.out.println(p.calculate(3, 5));
	}
}
