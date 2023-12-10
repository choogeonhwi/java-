package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class readEX11 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("d:\\dev\\test.txt");
		// 업캐스팅, 문자 최상위 클래스reader, filereader 하위
		int readData;
		char[] cbuf = new char[2];
		String data = "";

		while (true) {
			readData = reader.read(); // 한개 문자 단위
			if (readData == -1) {
				break;
			}
//		   System.out.println(readData);
			System.out.println((char) readData);
		}
		reader.close();
	}
}
