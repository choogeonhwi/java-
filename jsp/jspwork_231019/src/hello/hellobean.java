package hello;

//jsp에서는 빈으로 객체 생성해서 값 저장/읽기
public class hellobean {
	// 자바의 필드가 jsp 빈에서 프로퍼티(필드) 용어 사용
	private String n = "홍길동";
	private int age = 20;

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
