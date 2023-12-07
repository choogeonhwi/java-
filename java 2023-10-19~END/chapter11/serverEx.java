package chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serverEx {
	public static void main(String[] args) {
		ServerSocket listener = null; // 서버 소켓 선언
		Socket s = null; // 클라이언트 소켓 선언
		BufferedReader in = null; // 클라이언트에서 들어오는 데이터
		BufferedWriter out = null;// 서버에서 보내는 데이터
		Scanner scanner = new Scanner(System.in);
		try {
			listener = new ServerSocket(9999);// 서버소켓객체 생성
			System.out.println("연결을 기다리고 있습니다.");
			s = listener.accept(); // 클라이언트의 연결 대기
			// 소켓 객체로 데이터를 주고 받음

			in = new BufferedReader(new InputStreamReader(s.getInputStream())); // 클라이언트에서 들어오는 데이터
			out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream())); // 서버에서 보내는 데이터

			while (true) {
				String inputM = in.readLine(); // 한행의 문자열을 읽는다.
				if (inputM.equals("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료");
					break;
				}
				System.out.println("클라이언트" + inputM); // 클라이언트에서 온 메시지
				System.out.print("보내기>>");
				String outputM = scanner.nextLine();
				// 서버에서 보내는 메시지
				out.write(outputM + "\n"); // 클라이언트로 메시지보내기
				out.flush(); // 비정상적인 종료일때 메시지 재전송 (버퍼)
			}
		} catch (Exception e) {
			e.printStackTrace(); // 기본 메시지 출력
		} finally {
			try {
				scanner.close();
				s.close();
				listener.close();
				// 객체 반납은 들어온 순서의 역순(예외 발생을 고려하여)
			} catch (Exception e2) { // 서버와 클라이언트 간에 입출력시 예외 발생
				System.out.println("클라이언트와 채팅 중 오류가 발생하였습니다.");

			}
		}
	}
}
