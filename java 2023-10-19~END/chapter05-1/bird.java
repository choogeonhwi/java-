package chapter051;

//생명 1 멤버 4
abstract class bird extends animal {
	public int wing = 2;

	public void walk() {
		System.out.println("walk");
	}

	public void eat() {
		System.out.println("eat");
	}
}
