package chapter04;

import java.util.Scanner;

public class rectangle {
	int width;
	int height;

	public int getarea() {
		return width * height;
	}

	public static void main(String[] args) {
		// new rectangle();//멤버가 3개

		new rectangle();
		Scanner scanner = new Scanner(System.in);
		rectangle rect = new rectangle();
		System.out.println(">>");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은" + rect.getarea());
		scanner.close();
	}
}
