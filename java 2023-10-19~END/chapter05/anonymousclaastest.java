package chapter05;

import chapter04.staticmember;

interface rc {
	void ton();

	void toff();
}

public class anonymousclaastest {
	public static void main(String[] args) {
		rc ac = new rc() {

			@Override
			public void ton() {
				System.out.println("on");

			}

			@Override
			public void toff() {
				System.out.println("off");

			}
		};
		ac.ton();
		ac.toff();
	}
}
