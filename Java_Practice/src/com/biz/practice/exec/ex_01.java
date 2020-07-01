package com.biz.practice.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex_01 {
	public static void main(String[] args) {
		List<Integer> unit = new ArrayList<Integer>();
		Random rnd = new Random();
		int num = rnd.nextInt(1000);
		System.out.println(num);
		
		int rm = 0;
		while(num!=0) {
			rm = num%10;
			unit.add(rm);
			num/=10;
		}
		
		int index = unit.size() -1;
		for(int i = index; i>=0; i--) {
			System.out.print(unit.get(i));
		}
		
		
	}

}
