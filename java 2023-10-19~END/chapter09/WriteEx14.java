package chapter09;

import java.io.FileWriter;

import java.io.Writer;

public class WriteEx14 {
	public static void main(String[] args) throws Exception {
		Writer w = new FileWriter("d:/output.txt");
//			char[] data = "홍길동2".toCharArray();
		String data = "안녕 자바 프로그램";

//			w.write(data, 1, 2);
		w.write(data, 3, 2); // 3인덱스부터 2자

		w.close();
	}
}
