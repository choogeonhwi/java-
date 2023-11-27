package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q02 {
//백준 1002번
	public static void main(String[] args) throws IOException { // 예외처리

		// 참조변수 br로 가르키는 BufferedReader 타입의 객체생성
		// 스캐너 보다 효율적
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 참조변수 sb로 가르키는 StringBuilder 타입의 객체생성
		// 변경이 가능한 문자열 생성
		StringBuilder sb = new StringBuilder();

		// 문자열 -> 정수 -> T
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			// StringTokenizer의 참조변수 st로 가르키는 객체생성
			// 문자열을 분리할 수 있는 명령어
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			// 문자열 토큰 반환 -> 정수 반환
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());

			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());

			// 선택된 요스의 마지막에 새로운 요소를 추가
			// 메소드 호출
			sb.append(tangent_point(x1, y1, r1, x2, y2, r2)).append('\n');
		}
		System.out.println(sb);

	}

	// 접점 개수 구하는 함수
	public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {

		// 제곱 함수
		// 중점간 거리 distance의 제곱
		int distance_pow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		// 중점이 같으면서 반지름도 같을 경우(같은 점이므로 무한대)
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}

		// 두 원의 반지름 합보다 중점간 거리가 더 길 때
		else if (distance_pow > Math.pow(r1 + r2, 2)) {
			return 0;
		}

		// 원 안에 원이 있으나 내접하지 않을 때
		else if (distance_pow < Math.pow(r2 - r1, 2)) {
			return 0;
		}

		// 내접할 때
		else if (distance_pow == Math.pow(r2 - r1, 2)) {
			return 1;
		}

		// 외접할 때
		else if (distance_pow == Math.pow(r1 + r2, 2)) {
			return 1;
		}

		else {
			return 2;
		}

	}

}
