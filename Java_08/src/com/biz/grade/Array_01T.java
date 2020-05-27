package com.biz.grade;

import java.util.Random;

public class Array_01T {
	public static void main(String[] args) {
		
		int[] intKor = new int[20];
		int[] intEng = new int[20];
		int[] intMath = new int[20];
		int[] intMusic = new int[20];
		
		Random rnd = new Random();
		
		for(int i=0; i<20; i++) {
			intKor[i] = rnd.nextInt(50)+51;
			intEng[i] = rnd.nextInt(50)+51;
			intMath[i] = rnd.nextInt(50)+51;
			intMusic[i] = rnd.nextInt(50)+51;
		}
		
		System.out.println("================================================");
		System.out.println("국어\t영어\t수학\t음악\t합계\t평균");
		System.out.println("================================================");
		
		for(int i=0; i<20; i++) {
			int sum = intKor[i]+intEng[i]+intMath[i]+intMusic[i];
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n",intKor[i],intEng[i],intMath[i],intMusic[i],sum,sum/4);
		}
		
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int musicSum = 0;
		
		for(int i=0; i<20; i++) {
			korSum += intKor[i];
			engSum += intEng[i];
			mathSum += intMath[i];
			musicSum += intMusic[i];
		}
		
		System.out.println("===========================================");
		System.out.printf("총점\t%d\t%d\t%d\t%d\n",korSum,engSum,mathSum,musicSum);
		System.out.printf("평균\t%d\t%d\t%d\t%d\n",korSum/20,engSum/20,mathSum/20,musicSum/20);
				
	}

}
