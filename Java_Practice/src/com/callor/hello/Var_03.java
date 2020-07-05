package com.callor.hello;

import java.util.Random;

public class Var_03 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num1 = rnd.nextInt(100)+1;
		
		System.out.println(num1);
		if(num1%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}

}
