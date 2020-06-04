package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {
	
	private List<ScoreVO> scores;
	
	public void setScoreList(List<ScoreVO> scoreList) {
		this.scores = scoreList;	
	}
	
	int scoreSize = scores.size();
	public void stSum() {
		for(int i = 0; i<scoreSize; i++) {
			ScoreVO stSum = scores.get(i);
			stSum.setStSum(stSum.getKor()+stSum.getEng()+stSum.getMath());
		}
	}
	
	public void stAvg() {
		for(int i = 0; i<scoreSize; i++) {
			ScoreVO stAvg = scores.get(i);
			stAvg.setStAvg(stAvg.getStSum()/scoreSize);
		}
	}
	
	public void scoreList() {
		System.out.println("================================================================");
		System.out.println("성적리스트");
		System.out.println("----------------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------------------");
		
			
		
	}

}
