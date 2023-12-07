package chapter07;

public class Box {
	private Object object;

	public Object get() {
		return object;
	}

	public void set(Object object) {
		this.object = object; // 파라미터<-객체=필드에 세팅
	}

}
