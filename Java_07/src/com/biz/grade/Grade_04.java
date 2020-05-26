package com.biz.grade;

import java.util.Random;

public class Grade_04 {
	public static void main(String[] args) {
		
		float floatKor,floatEng,floatMath;
		Random random = new Random();
		
		floatKor = random.nextInt(50) + 51;
		floatEng = random.nextInt(50) + 51;
		floatMath = random.nextInt(50) + 51;
		
		float floatSum = floatKor+floatEng+floatMath;
		float floatAvg = floatSum/3;
		
		System.out.println("총점 : " + floatSum);
		System.out.println("평균 : " + floatAvg);
		
		
	}
	
}
