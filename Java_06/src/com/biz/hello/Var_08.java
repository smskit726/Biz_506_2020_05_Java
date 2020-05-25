package com.biz.hello;

public class Var_08 {
	public static void main(String[] args) {
		
		int sum=0, i=2;
		
		for(i=2; i<=100; i++) {
			int j=2;
			for(j=2;j<i;j++) {
				
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				sum+=i;
			}
			
		} //for(i)가 끝나는 지점
		System.out.printf("2 ~ %d까지 소수들의 합 : %d",i-1,sum);
	}

}
