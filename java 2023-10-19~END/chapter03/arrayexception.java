package chapter03;

public class arrayexception {
	public static void main(String[] args) {
		// 배열 인덱스를 벗어나는 예외 처리 방법

		int[] intarray = new int[5];
		intarray[0] = 0;

		try {
			for (int i = 0; i < 5; i++) {

				intarray[i + 1] = intarray[i] + i + 1;

				System.out.println(intarray[i]);
				// 원소5=크기6 계산하여 담을 수 없으므로 밑에 print 명령어는 생략됨 -> 10이 출력 안 되고 캐치가 실행

			}
		}
//			

		// } catch (Exception e) {
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위 벗어남");
		}

	}
}
