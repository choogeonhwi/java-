package question09;

import java.util.InputMismatchException;
import java.util.Scanner;

class People { // 이름과 번호를 관리하는 People 클래스 생성
	// 이름과 휴대폰 번호 변수 선언.
	String name;
	String phoneNum;

	// 이름과 번호를 받는 생성자 생성.
	public People(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	// 이름을 입력하면 번호를 보여주는 메서드 생성.
	public void ShowPhoneNum() {
		System.out.println(name + "의 번호는 " + phoneNum + "입니다.");
	}
}

public class AP {
	public static void main(String[] args) {
		boolean exit = false; // "그만"을 입력했을때 dowhile문을 빠져나오기 위한 불리언 변수
		/* catch문을 통해 오류가 검출 되면 프로그램이 끝나는 것을 막고 다시 입력하게 하기 위해 dowhile문안에 넣음 */
		do {
			/* try,catch를 통해 타입을 잘못 입력할 경우 콘솔창에 오류메시지를 띄어준다. */
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("인원수>> ");
				int personNum = scanner.nextInt();
				People[] p = new People[personNum];

				/* 이름과 전화번호 입력받기 */
				for (int i = 0; i < p.length; i++) {
					System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>"); // 반복문을 통해 이름과 번호를 입력한 인원 수 만큼 입력 받음.
					String pName = scanner.next();
					String pPhoneNum = scanner.next();

					p[i] = new People(pName, pPhoneNum); // 위에 생성해 놓은 p배열 객체주소에 입력한 값을 집어넣어 객체를 생성함.
				}

				System.out.println("저장되었습니다..."); // 값을 받은 뒤 저장되었음을 알려줌.

				/* 입력받은 이름과 전화번호 출력하기 */
				for (int j = 0; j < Integer.MAX_VALUE; j++) { // 번호를 찾기위해 입력해야할 이름을 받는 스캐너클래스 무한 반복
					System.out.print("검색할 이름>> ");
					String searchName = scanner.next();

					boolean test = true; // 입력값에 따라 다르게 출력하기 위해 만든 boolean 변수

					/* 객체 배열 값중에 입력한 이름이 있을 경우 해당 이름의 번호를 출력 */
					for (int i = 0; i < p.length; i++) { // 위에 생성한 객체배열 p의 길이만큼 반복
						if (searchName.equals(p[i].name)) {
							p[i].ShowPhoneNum();
							test = true;
							break;
						} else {
							test = false; // 이름이 없을 경우 이름이 없다는 것을 알린다.
						}
					}

					/* "그만"을 입력하면 프로그램을 종료, 다를 경우 "존재 하지 않습니다" 출력 */
					if (searchName.equals("그만")) {
						System.out.println("프로그램을 종료합니다.");
						exit = true; // dowhile 반복문 안에 있기 때문에 true로 바꿔주지 않으면 무한루프에 빠짐.
						break; // 프로그램 종료
					} else if (!test) {
						System.out.println(searchName + "이 없습니다"); // 입력 받은 문자열이 배열에 없을경우 출력
					}
				}

				scanner.close();

			} catch (InputMismatchException e) {
				System.out.println("값을 제대로 입력해주세요."); // 인원 수 입력 칸에 다른 타입을 넣었을 경우에 출력
			}

		} while (!exit); // "그만"이 입력될 경우 탈출
	}
}