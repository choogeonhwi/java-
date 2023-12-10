package chapter04;

import java.security.Principal;

public class arrayparameterex {

	static void rs(char a[]) { // 공백을 쉼표로 바꿈
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i] = ',';
			}
		}
	}

	static void pca(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		} // 파라미터 크기만큼 반복
		System.out.println();
	}

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		pca(c);
		rs(c);
		pca(c);
	}
}
