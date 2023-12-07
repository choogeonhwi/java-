package chapter05;

class weapon {
	protected int fire() { // 파이어벳 기능
		return 1;// 기본공
	}
}

class cannon extends weapon {
	@Override
	protected int fire() {
		// TODO Auto-generated method stub
		return 10; // 딜
	}
}

public class overriding {
	public static void main(String[] args) {
		weapon weapon;
		weapon = new weapon();
		System.out.println("기본딜 " + weapon.fire());

		weapon = new cannon();
		System.out.println("대포딜 " + weapon.fire());
	}
}
