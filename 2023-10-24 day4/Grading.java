package chapter02;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		System.out.println("입력");
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		char grade;
		// A+= 문자열 string a = scanner.next();
		switch (a / 10) {
		/*
		 * case 10: grade='A'; // "A+" break;
		 */
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;

		default:
			grade = 'F';
			break;
		}
		System.out.println("학점" + grade);
		/*
		 * if (a>=95) { System.out.println("A+"); //grade='A+' } else if(a>=90){
		 * System.out.println("A");
		 * 
		 * }else if(a>=80) { System.out.println("B"); } else {
		 * //System.out.println("학점은"+grade+"입니다"); }
		 */
	}
}
