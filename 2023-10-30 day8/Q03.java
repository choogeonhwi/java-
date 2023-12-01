package question04;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		int num[] = new int[5]; // 5개 숫자를 입력받으므로 배열을 크기를 지정해줌
		int j = 0;
		System.out.println("숫자 5개를 입력해주세요.");
		Scanner sc = new Scanner(System.in); // 숫자 5개를 입력받음
		for (int i = 0; i < num.length; i++) // for문을 배열개수만큼 돌림
		{
			num[i] = sc.nextInt();
			if (j <= num[i]) // j와 입력 숫자를 비교해주는 조건문
			{
				j = num[i]; // 조건문을 통해 더 큰 수인 배열안에 있는 값을 j에 넣어줌
			}
		}
		System.out.println("입력된 값 중 가장 큰 수는 " + j + "입니다."); // 최대 큰 수인 값이 들은 j를 출력해줌
		sc.close(); // scanner을 사용을 마침
	}
}
