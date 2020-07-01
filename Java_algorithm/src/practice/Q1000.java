package practice;

import java.util.Scanner;

public class Q1000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B;
		while (true) {
			A = sc.nextInt();
			B = sc.nextInt();

			if (A > 0 && B < 10) {
				break;
			}
		}
		sc.close();

		System.out.println(A + B);
	}

}
