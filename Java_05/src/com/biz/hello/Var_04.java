package com.biz.hello;

public class Var_04 {
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		
		sum = sum + num; //num : 0
		sum = sum + ++num; // num : 1
		sum = sum + ++num; // num : 2
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		sum = sum + ++num;
		
		System.out.printf("1부터 %d 까지의 덧셈 : %d\n",num,sum);
	}

}
