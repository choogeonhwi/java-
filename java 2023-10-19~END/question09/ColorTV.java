package question09;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

public class ColorTV extends TV {
	private int col;

	public ColorTV(int size, int col) {
		super(size);
		this.col = col;
	}

	void printProperty() {
		System.out.println(getSize() + "인치 " + col + "컬러");
	}

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}
// 32인치 1024컬러