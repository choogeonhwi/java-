package chapter02;

public class LogicalIOperator {
	public static void main(String[] args) {
		System.out.println('a' > 'b'); // 문자간의 비교(유니코드)
		System.out.println('a' < 'b');
		System.out.println(-1 < 0);
		System.out.println(3 >= 2);
		System.out.println("===================");
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		System.out.println("===================");
		System.out.println((3>2)&&(3>4));
		//참and거짓=거짓
		System.out.println((3!=2)||(-1>0));
		//같지않다(참)or거짓=참
		System.out.println((3!=2)^(-1>0));
		//참XOR거짓=참
		System.out.println();
	
	
	
	}
}
