package question09;

import org.omg.CORBA.PRIVATE_MEMBER;

class coltv {
	private int size;

	public coltv(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

public class IPTV extends coltv {
	private int col;
	private String a;

	public IPTV(String a, int size, int col) {
		super(size);
		this.a = a;
		this.col = col;
	}

	void printProperty() {
		System.out.println("나의 IPTV는 " + this.a + " 주소의 " + getSize() + "인치 " + col + "컬러");
	}

	public static void main(String[] args) {
		IPTV myTV = new IPTV("192.1.1.2", 32, 2048);
		myTV.printProperty();
	}
}