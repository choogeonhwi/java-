package chapter08;

import java.util.ArrayList;
import java.util.List;

public class arraylistEx {
	public static void main(String[] args) {

		// 리스트 컬렉션에서 어레이리스트 클래스로 객체 생성(제네릭 타입파라미터 스트링)
//		new ArrayList<E>();
		List<String> list = new ArrayList<>(); // 업캐스팅
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "database"); // list 인덱스2번을 삽입하여 servlet/jsp와 자리가 바뀜
		list.add("Spring");

		int size = list.size();
		System.out.println("총 리스트 갯수" + size);

		String skill = list.get(2); // 3번 자리의 원소를 담는다
		System.out.println("2번째 인덱스" + skill);

		for (int i = 0; i < list.size(); i++) {

			String str = list.get(i);
			System.out.println(i + ":" + str);

		}
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {

			String str = list.get(i);
			System.out.println(i + ":" + str);

		}
		list.remove("Spring");
		for (int i = 0; i < list.size(); i++) {

			String str = list.get(i);
			System.out.println(i + ":" + str);

		}
	}
}
