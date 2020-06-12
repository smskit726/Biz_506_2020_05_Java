package com.biz.practice.exec;

import java.util.Scanner;

public class Hw_610 {
	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 50;
		int num3 = 25;
		int temp = 0;
		
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp; 
		}
		
		if(num1>num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println(num1+"<"+num2+"<"+num3);
		
		
	}

}
