package com.callor.hello;

public class Var_06 {
	public static void main(String[] args) {
		int num = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i);
				num+=i;
			}
		}
		System.out.println("3의 배수들의 합은 " + num);
		
	}
}
