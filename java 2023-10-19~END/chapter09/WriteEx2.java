package chapter09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx2 {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("d:/output.txt");
		byte[] data = "DEF".getBytes();
		os.write(data);

//	for (int i = 0; i < data.length; i++) {
//		os.write(data[i]);
//		
//		
//	}

		os.close();
	}
}
