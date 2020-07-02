package com.biz.score;

import com.biz.score.service.ScoreService02;

public class ScoreMain2 {
	public static void main(String[] args) {
		
		ScoreService02 sService = new ScoreService02();
		
		while(true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.scoreList();
		System.out.println("업무 종료!");
	}

}
