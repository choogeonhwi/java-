package chapter051;

public class penguin extends bird implements swim2, fly {
	@Override
	public void swim() {
		System.out.println("penguins swim.");

	}

	public void fly() {
		System.out.println("penguins fly.");

	}
}
