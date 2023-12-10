package chapter09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx3 {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("d:/output.txt");
		byte[] data = "DEF".getBytes();
//os.write(data);
		os.write(data, 1, 2);// 인덱스 0이 없어 EF 출력
		os.flush(); // 인터넷이 불안정한 상태에서 버퍼에 담은 값을 내보낸다

		os.close();
	}
}
