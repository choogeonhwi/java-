package chapter05;

//응답이없으면 타임아웃
interface phonelnterface {
//	public static final int TIMEOUT=100;
	int TIMEOUT = 100;

//	public abstract void sendcall();
	void sendcall();

	void receivecall();

	default void printlogo() {
		System.out.println("**phone**");

	}

}

class samsungphone implements phonelnterface {

	@Override
	public void sendcall() {
		System.out.println("띠리링");
		// TODO Auto-generated method stub

	}

	@Override
	public void receivecall() {
		System.out.println("전화 옴");
		// TODO Auto-generated method stub

	}

//	폰기능
	public void flash() {
		System.out.println("전화기 불 왔어요");
	}
}

public class interfaceEx {
	public static void main(String[] args) {
		samsungphone p = new samsungphone();
		p.printlogo();
		p.sendcall();
		p.receivecall();
		p.flash();
	}
}
