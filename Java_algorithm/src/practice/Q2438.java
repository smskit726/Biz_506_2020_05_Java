package practice;

import java.util.Scanner;

public class Q2438 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		while (true) {
			num = scan.nextInt();
			if (num >= 1 && num <= 100) {
				break;
			}
		}
		int i = 0;
		for(i=0; i<num; ++i) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println(i);
	}
}