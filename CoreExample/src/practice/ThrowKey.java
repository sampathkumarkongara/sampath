package practice;

import java.util.Scanner;

public class ThrowKey {
	static void validation(int Age) {
		if (Age<18) {
			throw new ArithmeticException("not eligible to voting");
		} else {
			System.out.println("welcome to voting");
		}
	}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your age ");
		int n = s.nextInt();
		validation(n);
		//System.out.println("rest of the code");
	}

}
