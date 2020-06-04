package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_02 {
	public static void main(String[] args) {
		
		// size() 가 0인 intList가 새로 생성된다.
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		int sum = 0;

		for (int i = 0; i < 100; i++) {
			// 1 ~ 100까지 난수(임의 숫자)를 발생하여
			int num1 = rnd.nextInt(100)+1;
			// intList에 추가하라
			intList.add(num1);
		}
		// size() 가 100이 되고 정수값이 100개 추가 된 intList 된다.

		for(int i = 0; i<100; i++) {
			sum += intList.get(i);
			// intLit[i]
		}
		System.out.println("합계 : " +sum);

		
	}

}
