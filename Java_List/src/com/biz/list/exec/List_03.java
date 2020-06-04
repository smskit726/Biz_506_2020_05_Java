package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_03 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i=0; i<100; i++) {
			int num = rnd.nextInt(100)+1;
			intList.add(num);
		}
		
		/*for(int i=0; i<100; i++) {
			if(intList.get(i)%2==0) {
				System.out.println(intList.get(i));
			}
		}
		System.out.println();*/
		
		int count=0;
		for(int i=0; i<100; i++) {
			if(intList.get(i)%2==0) {
				System.out.printf("%d\t",intList.get(i));
				count++;
				if(count%5==0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n짝수 개수 : " + count);
		
		


		
	}
}
