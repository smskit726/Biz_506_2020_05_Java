package com.biz.grade;

import java.util.Random;

public class Grade_05 {
	public static void main(String[] args) {
		
		Random random = new Random();
		float floatKor1 = random.nextInt(50)+51;
		float floatKor2 = random.nextInt(50)+51;
		float floatKor3 = random.nextInt(50)+51;
		float floatKor4 = random.nextInt(50)+51;
		float floatKor5 = random.nextInt(50)+51;
		float floatKor6 = random.nextInt(50)+51;
		float floatKor7 = random.nextInt(50)+51;
		float floatKor8 = random.nextInt(50)+51;
		float floatKor9 = random.nextInt(50)+51;
		float floatKor10 = random.nextInt(50)+51;
		
		float floatSum = floatKor1+floatKor2+floatKor3+floatKor4+floatKor5+floatKor6+floatKor7+floatKor8+floatKor9+floatKor10;
		float floatAvg = floatSum/10;
		
		System.out.println(floatKor1);
		System.out.println(floatKor2);
		System.out.println(floatKor3);
		System.out.println(floatKor4);
		System.out.println(floatKor5);
		System.out.println(floatKor6);
		System.out.println(floatKor7);
		System.out.println(floatKor8);
		System.out.println(floatKor9);
		System.out.println(floatKor10);
		System.out.println("총점 : " + floatSum);
		System.out.println("평균 : " + floatAvg);
		
		
	}

}
