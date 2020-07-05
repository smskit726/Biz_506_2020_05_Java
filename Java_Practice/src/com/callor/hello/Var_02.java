package com.callor.hello;

import java.util.Random;

public class Var_02 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(100)+1;
		int result = num*55;
		System.out.println(result);
	}

}
