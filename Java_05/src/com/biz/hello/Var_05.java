package com.biz.hello;

import java.util.Random;

public class Var_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(50)+50;
		int num2 = rnd.nextInt(50)+51;
		
		System.out.printf("%d %d\n", num1,num2);
		System.out.println(num1 + " " + num2);
		
		//375=(x +(x*0.1))의 계산에 의해 만들어진 값이다. x의 값은?
	}

}
