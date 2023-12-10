package chapter09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx1 {// 바이트 단위 출력 하위 스트림 클래스
	public static void main(String[] args) throws IOException { // 텍스트 파일로 객체생성
		OutputStream os = new FileOutputStream("d:/output.txt"); // 업캐스팅
		byte[] data = "ABC".getBytes();
		// 바이트단위 문자열 읽기

		for (int i = 0; i < data.length; i++) {
			os.write(data[i]); // 객체에 바이트 배열원소 넣기

		}
		os.close();
	}
}
