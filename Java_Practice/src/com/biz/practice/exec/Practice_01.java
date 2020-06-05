package com.biz.practice.exec;

import java.util.Random;

public class Practice_01 {
	// 학생 20명, 과목 5개의 성적처리
	public static void main(String[] args) {
		int student = 20;
		int subject = 5;
		int[][] score = new int[student][subject];
		Random rnd = new Random();
	
		String[] subTitle= new String[]{"국어", "영어", "수학", "음악", "미술"};
		
		for(int i=0;i<student;i++) {
			for(int j=0; j<subject; j++) {
				score[i][j] = rnd.nextInt(50)+51;
			}
		}
		
		int stdTotal[]= new int[student];
		int stdAvg[] = new int[student];
		for(int i=0;i<student;i++) {
			for(int j=0;j<subject;j++) {
				stdTotal[i] += score[i][j];
			}
			stdAvg[i] = stdTotal[i]/subject;
		}
		
		System.out.println("========================================================");
		System.out.println("학생성적리스트");
		System.out.println("========================================================");
		
		for(int i = 0; i<subject; i++) {
			System.out.printf("%s\t",subTitle[i]);
		}
		System.out.println("총점\t평균\t");
		System.out.println("--------------------------------------------------------");
		
		for(int i = 0; i<student; i++) {
			for(int j = 0; j<subject; j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.printf("%d\t%d\n",stdTotal[i],stdAvg[i]);
		}
		
		int[][] subTotal = new int[1][subject];
		for(int i=0; i<subject; i++) {
			for(int j=0; j<student; j++) {
				subTotal[0][i] += score[j][i];
			}
		}
		
		System.out.println("--------------------------------------------------------");
		for(int i=0; i<subject; i++) {
			System.out.printf("%d\t",subTotal[0][i]);
		}
		
		System.out.println();
		for(int i=0; i<subject; i++) {
			System.out.printf("%d\t",subTotal[0][i]/student);
		}
		
		
	}
}
