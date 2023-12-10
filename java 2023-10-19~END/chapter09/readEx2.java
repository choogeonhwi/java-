package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class readEx2 {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("D:\\dev\\test.txt"); // 업 캐스팅
		// 바이트단위 최상위 스트림 클래스 inputStream
		// 바이트단위 fileinputStream 하위 스트림 클래스
		int readByte;
		byte[] readBytes = new byte[3];
		String data = "";

		while (true) {
//		readByte =	is.read();  //바이트 단위로 받아 정수로 읽는다
			readByte = is.read(readBytes); // 3바이트 단위로 받아 정수로 읽는다[배열로 용량을 키운다]
			if (readByte == -1) { // EOF(파일 끝 -1)
				break;
			}

//			System.out.print((char)(readByte));
//			System.out.print(readByte);
			data += new String(readBytes, 0, readByte);
			// 0인덱스에서 길이만큼 읽는다
		}
		System.out.println(data);

		is.close();
	}
}
