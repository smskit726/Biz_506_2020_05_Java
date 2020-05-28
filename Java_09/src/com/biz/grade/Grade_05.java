package com.biz.grade;

import java.util.Random;

import com.biz.score.Student;

public class Grade_05 {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0; i<100000000; i++) {
			sum = 100;
		}
		// sum은 얼마?
		System.out.println(sum);
		/*
		 * for 반복문 밖에서 정수형 변수 sum을 선언과 동시에 0으로 초기화하고
		 * for 반복문을 통해 반복되는 동안 sum의 값은 계속 100이 할당되므로
		 * for 반복문이 끝나도 sum에는 100이라는 값이 할당되어있다.
		 */
		
		for(int i = 0; i<10; i++) {
			System.out.println(sum);
		}
		
		// Student 클래스에 선언된 make() method를 호출하기
		Student student = new Student();
						
		// Student 클래스에 선언된 make() method를 호출하기
		student.make();
		String strN = student.getName();
		/*
		 * public class Student {
		 * 		String strName = "홍길동";
		 * 		public void make() {
		 * 			strName = "이몽룡";
		 * 		}
		 * 		?? strName => 이몽룡
		 * 
		 * 		public String getName() {
		 * 			return strName;
		 * 		}
		 * }
		 * ?? strName => ?
		 */
		
		System.out.println(strN);
		
		
		
	}

}
