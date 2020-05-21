package com.biz.hello;

public class VarBoolean_01 {

	public static void main(String[] args) {
		
		int num1=257;
		
		if(num1%2==0) {
			System.out.println(num1+"은 짝수입니다.");
		}

		if(num1%2!=0) {
			System.out.println(num1+"은 짝수가 아닙니다.");
		}
		
		int num2 = 30;
		boolean bVar = (num2%2==0);
		if(bVar) {
			System.out.println(num2+"은 짝수가 아닙니다.");
		}

		
	}

}
