package question06;

public class song {
	String ti;
	String ar;
	String co;
	int ye;

	public song(String co, String ar, String ti, int ye) {
		this.ti = ti;
		this.ar = ar;
		this.ye = ye;
		this.co = co;
	}

	void show() {
		System.out.println(ye + "년" + co + "국적의" + ar + "가 부른" + ti);
	}

	public static void main(String[] args) {

		song song = new song("스웨덴", "ABBA", "Dancing Queen", 1978);
		song.show();
	}

}
