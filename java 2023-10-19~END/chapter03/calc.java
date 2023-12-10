package chapter03;

public class calc {
	public static void main(String[] args) {
		// 메인 메소드 매개 변수 이용
		// args=매개 변수
		double sum = 0.0;

		for (int i = 0; i < args.length; i++) {
			sum += Double.parseDouble(args[i]); // Double = wrapper 클래스
			// pasrsedounle(); 실수로 변환하는 메소드
		}
		System.out.println("합계" + sum);
	}
}
