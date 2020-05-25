package com.biz.hello;

import java.util.Random;

public class Var_16 {
	public static void main(String[] args) {
		
		int intKor,intEng,intMath;
		Random rnd = new Random();
		intKor = rnd.nextInt(50)+51;
		intEng = rnd.nextInt(50)+51;
		intMath = rnd.nextInt(50)+51;
		
		System.out.printf("총점 : %d\n" , intKor+intEng+intMath);
		System.out.printf("평균 : %d\n", (intKor+intEng+intMath)/3);
	}

}
