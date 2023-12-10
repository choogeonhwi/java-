package chapter07;

public class productEx {
	public static void main(String[] args) {
		product<Tv, String> product1 = new product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		Tv tv = product1.getKind();
		System.out.println(tv);
		// 객체 값 주소

		String tvModel = product1.getModel();
		// 스마트 Tv
		System.out.println(tvModel);

		product<Car, String> product2 = new product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");

		Car car = product2.getKind();
		System.out.println(car);

		String carModel = product2.getModel();
		System.out.println(carModel);
	}
}
