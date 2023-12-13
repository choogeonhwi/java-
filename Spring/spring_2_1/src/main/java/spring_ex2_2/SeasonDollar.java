package spring_ex2_2;

public class SeasonDollar {
	public static void main(String[] args) {
		Season s = new Season();
		Won2dollar w = new Won2dollar();
		
		s.setA(9);
		w.setDollar(3300);
		
		s.s();
		w.d();
	}
}
