package question09;

class p {
	private int x, y;

	public p(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {

		return "색의 " + "(" + getX() + "," + getY() + ")의 점";
	}
}

public class colp extends p {
	private String c;

	public colp(int x, int y, String z) {
		super(x, y);
		this.c = z;

	}

	public void setColor(String a) {
		this.c = a;
	}

	public void setXY(int a, int b) {
		move(a, b);
	}

	public static void main(String[] args) {
		colp cp = new colp(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
