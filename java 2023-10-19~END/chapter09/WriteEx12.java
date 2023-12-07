package chapter09;

import java.io.FileWriter;

import java.io.Writer;

public class WriteEx12 {
	public static void main(String[] args) throws Exception {
		Writer w = new FileWriter("d:/output.txt");
		char[] data = "홍길동2".toCharArray();
		w.write(data);
		/*
		 * for (int i = 0; i < data.length; i++) { w.write(data[i]); }
		 */
		w.close();
	}
}
