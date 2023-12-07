package question06;

public class TV {
	String a;
	int b;
	int c;

	public TV(String a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	void show() {
		System.out.println(a + "에서 만든" + b + "년형 " + c + "인치 TV");
	}

	public static void main(String[] args) {
		TV mt = new TV("LG", 2017, 32);
		mt.show();
	}
}
