package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class readEx1 {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("D:\\dev\\test.txt"); // 업 캐스팅
		// 바이트단위 최상위 스트림 클래스 inputStream
		// 바이트단위 fileinputStream 하위 스트림 클래스
		int readByte;
		/*
		 * while (true) { readByte = is.read(); //바이트 단위로 받아 정수로 읽는다 if (readByte == -1)
		 * { // EOF(파일 끝 -1) break; } //13:엔터 //10:첫번째 열 System.out.println(readByte);
		 * System.out.print((char)(readByte));
		 * 
		 * }
		 */
		while ((readByte = is.read()) != -1) {
			System.out.println((char) readByte);

		}
		is.close();
	}
}
