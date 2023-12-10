package chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA {
}

public class hashsetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // 업캐스팅
//		Set<Object> set=new HashSet<>(); //업캐스팅
		set.add("Java");
		set.add("JDBC");
		set.add("Servalet/JSP");
//		set.add("Java");
//중복		
//      AA A = new AA(); 
		// 객체타입으로 사용
//		set.add(A);
		set.add("iBatis");
		int size = set.size();
		System.out.println("총객체수" + size);
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		System.out.println("총객체수" + size);

		for (String string : set) {
			// foreach문 컬렉션에서 객체 가져온다
			System.out.println("\t" + string);
		}
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어있음");

		} else {
			System.out.println("객체 있음");
		}
	}
}
