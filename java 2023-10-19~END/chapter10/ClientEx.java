package chapter10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		Socket s = null;
		BufferedReader in = null; // 클라이언트에서 들어오는 데이터
		BufferedWriter out = null;// 서버에서 보내는 데이터
		Scanner scanner = new Scanner(System.in);

		try {
			s = new Socket("localhost", 9999); // 서버 ip와 포트를 가지고 소켓객체 생성
			in = new BufferedReader(new InputStreamReader(s.getInputStream())); // 클라이언트에서 들어오는 데이터
			out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream())); // 서버에서 보내는 데이터
			while (true) {
				System.out.println("보내기>>");
				String outputM = scanner.nextLine(); // 클라이언트에서 보내는 메시지
				if (outputM.equals("bye")) {
					out.write(outputM + "\n"); // 서버로 메시지 보내기
					out.flush();
					break;
				}
				out.write(outputM + "\n"); // 서버로 메시지 보내기
				out.flush(); // 버퍼 재전송
				String inputM = in.readLine(); // 한행 문자열
				System.out.println("서버의" + inputM); // 서버에서 온 메시지

			}
		} catch (Exception e) { // 소켓 객체로 데이터를 주고 받음
			e.printStackTrace();
		}
		try {
			scanner.close();
			s.close();
			// 자원 반납
		} catch (Exception e2) { // 서버와 클라이언트 간에 입출력시 예외 발생
			System.out.println("서버와 채팅 중 오류가 발생하였습니다.");

		}

	}
}
