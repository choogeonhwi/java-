package chapter03;

public class returnarray {
	static int[] makearray() {
		int temp[] = new int[4];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = i; // 0123

		}

//		return 0; int타입을 넣었기때문에 오류
//		return []; 대괄호 사용 불가
		return temp; // 0123
	}

	public static void main(String[] args) {
		// 배열 리턴
		int intarray[];
		intarray = makearray(); // temp 배열 받음

		for (int i = 0; i < intarray.length; i++) {
			System.out.print(intarray[i] + " ");
		}
	}
}
