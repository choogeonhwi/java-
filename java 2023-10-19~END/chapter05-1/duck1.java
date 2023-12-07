package chapter051;

public class duck1 extends bird implements swim2, fly {
	@Override
	public void swim() {
		System.out.println("ducks swim.");

	}

	@Override
	public void fly() {
		System.out.println("ducks fly.");

	}
}