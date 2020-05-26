package com.biz.grade;

import java.util.Random;

public class Grade_10 {
	
	public static void main(String[] args) {
		
		int[] intKorScore = new int[10];
		int[] intEngScore = new int[10];
		int[] intMathScore = new int[10];
		
		Random rnd = new Random();
		for(int i=0; i<10; i++) {
			intKorScore[i] = rnd.nextInt(50)+51;
			intEngScore[i] = rnd.nextInt(50)+51;
			intMathScore[i] = rnd.nextInt(50)+51;
		}
		System.out.println("====================================");
		System.out.println("학생 성적 리스트");
		System.out.println("------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점");
		System.out.println("------------------------------------");
		for(int i=0; i<10; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\n", i+1, intKorScore[i], intEngScore[i], intMathScore[i], intKorScore[i]+intEngScore[i]+intMathScore[i]);
		}
		System.out.println("====================================");
		
		int intKorSum=0;
		int intEngSum=0;
		int intMathSum=0;
		for(int i=0; i<10; i++) {
			intKorSum += intKorScore[i];
			intEngSum += intEngScore[i];
			intMathSum += intMathScore[i];
		}
		
		System.out.printf("총점  \t%d\t%d\t%d\t%d\n", intKorSum, intEngSum, intMathSum, intKorSum+intEngSum+intMathSum);
		System.out.printf("평균  \t%d\t%d\t%d\t%d\n", intKorSum/10, intEngSum/10, intMathSum/10, (intKorSum+intEngSum+intMathSum)/10);
		System.out.println("====================================");
				
	}

}
