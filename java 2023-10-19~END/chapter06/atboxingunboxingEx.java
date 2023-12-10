package chapter06;

public class atboxingunboxingEx {
	public static void main(String[] args) {

		int n = 10;
		Integer intObject = Integer.valueOf(n); // 박싱
// Integer intObject = n;
		Integer intObject2 = n;// 오토 박싱
		System.out.println(intObject);
		System.out.println(intObject2);

// int m = intObject.intValue() + intObject.intValue();//언박싱
		int m = intObject + intObject.intValue();// 오토 언박싱
		System.out.println(m);
	}
}
