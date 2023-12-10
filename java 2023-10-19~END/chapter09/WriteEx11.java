package chapter09;

import java.io.FileWriter;

import java.io.Writer;

public class WriteEx11 {
	public static void main(String[] args) throws Exception {
		Writer w = new FileWriter("d:/output.txt");
		char[] data = "홍길동".toCharArray();

		for (int i = 0; i < data.length; i++) {
			w.write(data[i]);
		}
		w.close();
	}
}
