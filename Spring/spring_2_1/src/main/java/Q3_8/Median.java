package Q3_8;

public class Median {
public void p(int p1, int p2, int p3) {
		
		if ((p1<p2 && p2<p3) || (p1>p2 && p2>p3) ) {
			System.out.println(p1+","+p2+","+p3+"중 중간값은"+p2);
		}
		if ((p3<p1 && p1<p2) || (p3>p1 && p1>p2)) {
			System.out.println(p1+","+p2+","+p3+"중 중간값은"+p1);
		}
		if ((p1<p3 && p3<p2) || (p1>p3 && p3>p2)) {
			System.out.println(p1+","+p2+","+p3+"중 중간값은"+p3);
		}
		
			
		}
}
