package chapter08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapEx {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		// 업 캐스팅, 구조가 키, 값으로 구성
		// 인터페이스 타입으로 hashmap 클래스 객체생성 키문자열, 값 정수형 wrapper클래스
		map.put("임영웅", 31);
//	map.put("임영웅", 30); // 후순위가 같은 주소에 덮어씌움	
		map.put("영탁", 38);
		map.put("이찬원", 25);
		map.put("김호종", 30);
		map.put("정동원", 14);

		System.out.println("총 Entry 수:" + map.size()); // map, entry 구조로 키/값 구성
		System.out.println("임영웅" + map.get("임영웅"));
		System.out.println();

		Set<String> keySet = map.keySet(); // 키를 다 받아와서 인터페이스에 입력
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) { // 컬렉션이 있으면 참
			String key = keyIterator.next();
			map.get(key);
			Integer value = map.get(key); // get 메소드로 맵 컬렉션의 키를 가지고 값을 가져옴
			System.out.println("\t" + key + ":" + value);
			// 순서는 랜덤으로 발생
		}
		System.out.println();
		map.remove("임영웅");
		System.out.println("총 entry 수" + map.size());

		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
// Map.Entry 구조로 키/값으로 객체 받음
		Iterator<Map.Entry<String, Integer>> entryIterator = entryset.iterator();

		// 두 번째 방식
		while (entryIterator.hasNext()) { // 컬렉션 객체 존재 참
			Map.Entry<String, Integer> entry = entryIterator.next(); // 컬렉션 객체 가져옴
			String key = entry.getKey(); // 키
			Integer value = entry.getValue();// 값

			System.out.println(key + "" + value);

		}
		System.out.println();

		map.clear();
		System.out.println("총 entry 수" + map.size());
	}
}
