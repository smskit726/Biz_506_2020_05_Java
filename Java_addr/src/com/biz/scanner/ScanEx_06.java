package com.biz.scanner;

import java.util.Scanner;

public class ScanEx_06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 >> ");
		String strInput = scan.nextLine();
		System.out.println("입력된 문자열 : " + strInput);
		
		System.out.print("숫자 1 >> ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자 2 >> ");
		int num2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d", num1, num2, num1+num2);
		
		scan.close();
	}

}
