package com.biz.grade;

public class Array_03 {
	public static void main(String[] args) {

		/*
		 * 1~100까지 범위의 수 중 짝수의 개수는 몇개인가? 1~100까지 범위의 수 중 3의 배수의 개수는 몇개인가?
		 */

		int evenCount = 0;
		int timeCount = 0;

		int intSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				intSum += i;
				evenCount++; // evenCount+=1
			}
		}
		System.out.println("짝수의 합 : " + intSum);
		System.out.println("짝수 개수 : " + evenCount);

		intSum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0) {
				intSum += i;
				timeCount++;
			}
		}
		System.out.println("3의배수 합 : " + intSum);
		System.out.println("3의배수 개수 : " + timeCount);

	}

}
