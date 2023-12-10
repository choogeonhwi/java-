package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class P {
	int id;
	String name;
	int price;

	public P(int id2, String name2, int price2) {
		id = id2;
		name = name2;
		price = price2;
	}
}

public class s3 {
	public static void main(String[] args) {
//		new ArrayList<new P()>(); 오류
		List<P> list = new ArrayList<P>(); // 업캐스팅 객체생성
		list.add(new P(1, "N", 100));
		list.add(new P(2, "TV", 320));
		list.add(new P(3, "WM", 250));
		list.add(new P(4, "AC", 500));

		List<String> r = list.stream().filter(p -> p.price > 300).map(p -> p.name).collect(Collectors.toList());
		System.out.println(r);
	}
}
