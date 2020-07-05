package com.callor.hello;

import java.util.Random;

public class Var_07 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(901)+100;
		
		int value = (int)(num/1.1);
		System.out.println(value);
	}

}
