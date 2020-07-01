package com.biz.score.exec;

import com.biz.score.service.ScoreService01;

public class ScoreEx_01 {
	public static void main(String[] args) {
		
		ScoreService01 sService = new ScoreService01();
		
		while(true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.scoreList();
		System.out.println("업무 종료!");
	}

}
