package com.biz.hello;

public class VarBoolean_02 {

	// 코드 작성할때 들여쓰기 생활화
	
	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = 256;
		num2 = 354;
		
		if((num1+num2)%2==0) {
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2) + " 짝수입니다" );
		}
		
		if((num2-num1)%2==0) {
			System.out.println(num1 + "+" + num2 + "=" + (num2-num1) + " 짝수입니다" );
		}
		
		if((num1*num2)%2==0) {
			System.out.println(num1 + "+" + num2 + "=" + (num1*num2) + " 짝수입니다" );
		}
		
		if((num2/num1)%2==0) {
			System.out.println(num1 + "+" + num2 + "=" + (num2/+num1) + " 짝수입니다" );
		}
		
	}

}
