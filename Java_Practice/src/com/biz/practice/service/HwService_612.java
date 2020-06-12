package com.biz.practice.service;

import java.util.ArrayList;
import java.util.List;

public class HwService_612 {
	private List<Integer> num = new ArrayList<Integer>();
	
	public void setNum(List<Integer> num) {
		this.num = num;
	}
	
	public void calc() {
		int numSize = num.size();
		for(int i=0; i<numSize-1; i++) {
			for(int j=i+1; j<numSize; j++) {
				if(num.get(i)>num.get(j)) {
					int temp = num.get(i);
					num.set(i, num.get(j));
					num.set(j, temp);
				}
			}
		}
	}
	
	public void numService() {
		for(int i = 0; i<num.size(); i++) {
			System.out.printf("%d  ",num.get(i));
		}
	}

}
