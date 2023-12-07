package chapter12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraystest {
	public static void main(String[] args) {
		int array[] = { 9, 4, 5, 6, 2, 1, };
		printarray(array);
		System.out.println();
		Arrays.sort(array);
		printarray(array);
		System.out.println();
		// 9탐색 인덱스 변환 없으면 음수
		System.out.println(Arrays.binarySearch(array, 9));
		System.out.println(Arrays.binarySearch(array, -1));
		System.out.println(Arrays.binarySearch(array, 0));
		System.out.println(Arrays.binarySearch(array, 3));
		System.out.println(Arrays.binarySearch(array, 7));
		Arrays.fill(array, 8); // 배열에 특정한 값을 넣는다
		printarray(array);
	}

	private static void printarray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.print("]");

	}
}
