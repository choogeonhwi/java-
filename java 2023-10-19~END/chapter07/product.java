package chapter07;

import org.omg.CORBA.PRIVATE_MEMBER;

public class product<T, M> {
	private T kind;
	private M model;

	// 리턴
	public T getKind() {
		return kind;
	}

	// 매개변수ㄱ
	// v
	// 객체를 입력
	public void setKind(T kind) {
		this.kind = kind;
	}

	// 리턴
	public M getModel() {
		return model;
	}

	// 매개변수
	public void setModel(M model) {
		this.model = model;
	}

}
