package chapter14;

import java.util.Arrays;

public class MainTest1 {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int s = Arrays.stream(arr).sum();
		long c = Arrays.stream(arr).count();
		System.out.println(s);
		System.out.println(c);
	}
}
