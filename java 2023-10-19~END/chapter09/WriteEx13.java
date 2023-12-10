package chapter09;

import java.io.FileWriter;

import java.io.Writer;

public class WriteEx13 {
	public static void main(String[] args) throws Exception {
		Writer w = new FileWriter("d:/output.txt");
		char[] data = "홍길동2".toCharArray();
//			w.write(data);
		w.write(data, 1, 2);

		w.close();
	}
}
