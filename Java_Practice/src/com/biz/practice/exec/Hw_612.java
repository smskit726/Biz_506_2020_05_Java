package com.biz.practice.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.practice.service.HwService_612;

public class Hw_612 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		List<Integer> num = new ArrayList<Integer>();
		
		int listSize = 20; 
		for(int i = 0; i < listSize; i++) {
			num.add(rnd.nextInt(100)+1); 
		}
		
		HwService_612 service = new HwService_612();
		
		service.setNum(num);
		service.calc();
		service.numService();
		
	}
	
	
}
