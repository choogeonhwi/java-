package chapter09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fileEx {
	public static void main(String[] args) throws Exception {
//		File dir =new File("d:/aaa");
		File dir = new File("d:/aaa/bbb"); // 하위 디렉토리 포함
		File file1 = new File("d:/aaa/file1.txt"); // 파일
		File file2 = new File("d:/aaa/file2.txt"); // 파일
		File file3 = new File("d:/aaa/file3.txt"); // 파일

//		dir.mkdir();//디렉토리 생성
		dir.mkdirs();// 디렉토리 생성
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();

		File test = new File("d:/aaa");
		// 디렉토리 정보를가지고 객체를 생성

		File[] contents = test.listFiles(); // 하위 디렉토리 정보를 가진다(하위 디렉토리+파일)
		System.out.println("날짜                 시간                형태     크기           이름");
		System.out.println("--------------------------------------------------------------------------");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (int i = 0; i < contents.length; i++) {
			// long 타입 형태, [ms]1970/1/1 부터 현재까지
//			System.out.print(new Date(contents[i].lastModified()) ); //마지막 생성일자
			System.out.print(sdf.format(new Date(contents[i].lastModified()))); // 마지막 생성일자
//			System.out.println(contents[i]);

			if (contents[i].isDirectory()) { // 참=디렉토리
				System.out.println("\t<DIR>\t\t" + contents[i].getName());// 디렉토리나 파일이름

			} else {
				System.out.println("\t\t" + contents[i].length() + "\t" + contents[i].getName());// 디렉토리나 파일이름
			}

		}
	}
}
