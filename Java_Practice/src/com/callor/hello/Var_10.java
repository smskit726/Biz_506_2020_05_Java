package com.callor.hello;

import java.util.Random;

public class Var_10 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int intKor,intEng,intMath,intSum,intAvg;
		
		intKor = rnd.nextInt(50)+51;
		intEng = rnd.nextInt(50)+51;
		intMath = rnd.nextInt(50)+51;
		
		intSum = intKor+intEng+intMath;
		intAvg= intSum/3;
		
		System.out.println("총점 : "+intSum);
		System.out.println("평균 : "+intAvg);
		
	}

}
