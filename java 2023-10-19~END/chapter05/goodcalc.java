package chapter05;

abstract class calculator {
	// 추상클래스
	public abstract int add(int a, int b);

	public abstract int subtract(int a, int b);

	public abstract int average(int[] a);
}

public class goodcalc extends calculator {
	public static void main(String[] args) {
		goodcalc c = new goodcalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] { 1, 2, 3, 4, 5 }));

	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public int average(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
}
