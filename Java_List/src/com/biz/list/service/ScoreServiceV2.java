package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {

	private List<ScoreVO> scores;

	public void setScoreList(List<ScoreVO> scoreList) {
		this.scores = scoreList;
	}

	public void stSum() {
		for (int i = 0; i < scores.size(); i++) {
			ScoreVO stSum = scores.get(i);
			stSum.setStSum(stSum.getKor() + stSum.getEng() + stSum.getMath());
		}
	}

	public void stAvg() {
		for (int i = 0; i < scores.size(); i++) {
			ScoreVO stAvg = scores.get(i);
			stAvg.setStAvg(stAvg.getStSum() / 3);
		}
	}

	public void scoreList() {
		LineService line = new LineService();
		int lineLength = 50;
		System.out.println(line.do_line(lineLength));
		System.out.println("성적리스트");
		System.out.println(line.single(lineLength));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(line.do_line(lineLength));

		for (int i = 0; i < scores.size(); i++) {
			ScoreVO sVO = scores.get(i);
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", sVO.getNum(), sVO.getKor(), sVO.getEng(), sVO.getMath(),
					sVO.getStSum(), sVO.getStAvg());
		}
		System.out.println(line.do_line(lineLength));
	}

}
