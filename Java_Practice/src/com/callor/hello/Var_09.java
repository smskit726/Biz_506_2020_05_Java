package com.callor.hello;

public class Var_09 {
	public static void main(String[] args) {
		int i, j;
		int sum=0;
		for(i=2; i<100;i++) {
			for(j=2;j<i;j++) {
				if (i%j==0) {
					break;
				}
			}if(i==j) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
