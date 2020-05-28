package com.biz.grade;

import java.util.Random;

public class Grade_03 {
	public static void main(String[] args) {
		
		int intNum1 =0;
		int intNum2 =0;
		Random rnd = new Random();
		
		intNum1 = rnd.nextInt();
		intNum2 = intNum1*55;
		
		System.out.println(intNum2);
				
	}

}
