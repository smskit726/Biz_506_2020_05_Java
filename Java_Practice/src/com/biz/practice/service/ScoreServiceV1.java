package com.biz.practice.service;

import java.util.List;

import com.biz.practice.model.ScoreVO;

public class ScoreServiceV1 {
	
	private List<ScoreVO> scoreVO;
	
	public void setScoreVO(List<ScoreVO> scoreList) {
		this.scoreVO = scoreList;
	}
	
	public void stSum() {
		for(int i = 0; i<scoreVO.size(); i++) {
			ScoreVO stSum = scoreVO.get(i);
			stSum.setStSum(stSum.getKor()+stSum.getEng()+stSum.getMath()+stSum.getMusic());
		}
	}
	
	public void stAvg() {
		for(int i =0; i<scoreVO.size(); i++) {
			ScoreVO stAvg = scoreVO.get(i);
			stAvg.setStAvg(stAvg.getStSum()/4);
		}
	}
	
	public void scoreList() {
		LineService line = new LineService();
		int lineLength = 55;
		
		System.out.println(line.do_line(lineLength));
		System.out.println("성적리스트");
		System.out.println(line.single(lineLength));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(line.single(lineLength));
		
		for(int i=0; i<scoreVO.size(); i++) {
			ScoreVO scoreList = scoreVO.get(i);
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
					scoreList.getName(),
					scoreList.getKor(),
					scoreList.getEng(),
					scoreList.getMath(),
					scoreList.getMusic(),
					scoreList.getStSum(),
					scoreList.getStSum(),
					scoreList.getStAvg());
		}
		
		System.out.println(line.single(lineLength));
		
	}
	
	public void subSumAvg() {
		
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int musicSum = 0;
		
		for(int i=0; i<scoreVO.size(); i++) {
			ScoreVO subSum = scoreVO.get(i);
			korSum += subSum.getKor();
			engSum += subSum.getEng();
			mathSum += subSum.getMath();
			musicSum += subSum.getMusic();
		}
		
		System.out.printf("총점\t%d\t%d\t%d\t%d\n",korSum,engSum,mathSum,musicSum);
		System.out.printf("평균\t%d\t%d\t%d\t%d\n",
				korSum/scoreVO.size(),
				engSum/scoreVO.size(),
				mathSum/scoreVO.size(),
				musicSum/scoreVO.size());
	}


}
