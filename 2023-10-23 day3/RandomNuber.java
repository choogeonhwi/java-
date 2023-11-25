package chapter02;

public class RandomNuber {
	public static void main(String[] args) {
		int n=rolldie();
		
		
		
		
		System.out.println(n);
	
	
	
	}
	public static int rolldie() {
		double x = 6*Math.random();
		int temp = (int) x;
		return temp+1;
	}
	
	
	
}
