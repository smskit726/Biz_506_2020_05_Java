package com.biz.score;

import com.biz.score.service.ScoreService01_P;

public class ScoreMain {
	public static void main(String[] args) {
		
		ScoreService01_P sService = new ScoreService01_P();
		
		while(true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.scoreList();
		System.out.println("업무 종료!");
	}

}
