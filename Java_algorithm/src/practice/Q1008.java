package practice;

import java.util.Scanner;

public class Q1008 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A,B;
		
		while(true) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			if((A>0 && A<10) && (B>0 && B<10)) {
				break;
			}
		}
		sc.close();
		double C = (double)A/(double)B;
		System.out.println(C);
		
	}

}
