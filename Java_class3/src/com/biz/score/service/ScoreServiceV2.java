package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV2 {

	private ScoreVO[] scores;

	public void scoreSum(ScoreVO[] scores) {
		this.scores = scores;
		
		for (int i = 0; i < scores.length; i++) {
			scores[i].setStdSum(scores[i].getKor() + scores[i].getEng() + scores[i].getMath() + scores[i].getMusic());
		}
	}
	
	public void scoreAvg() {
		for (int i = 0; i < scores.length; i++) {
			scores[i].setStdAvg(scores[i].getStdSum() / 4);
		}
	}
	
	public void scoreList() {
		
		LineService line = new LineService();
		int lineLength = 55;

		System.out.println(line.do_line(lineLength));
		System.out.println("성적리스트");
		System.out.println(line.do_line(lineLength));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(line.single(lineLength));
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n", 
					scores[i].getName(),
					scores[i].getKor(),
					scores[i].getEng(),
					scores[i].getMath(),
					scores[i].getMusic(),
					scores[i].getStdSum(),
					scores[i].getStdAvg());
		}
		
		System.out.println(line.single(lineLength));

		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int musicSum = 0;
		int sumSum = 0;
		int avgSum = 0;

		for (int i = 0; i < scores.length; i++) {
			korSum += scores[i].getKor();
			engSum += scores[i].getEng();
			mathSum += scores[i].getMath();
			musicSum += scores[i].getMusic();
			sumSum += scores[i].getStdSum();
			avgSum += scores[i].getStdAvg();
		}

		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\t%d\n", korSum, engSum, mathSum, musicSum, sumSum, avgSum);
		System.out.printf("평균\t%d\t%d\t%d\t%d\t%d\t%d\n", 
				korSum / scores.length, 
				engSum / scores.length,
				mathSum / scores.length, 
				musicSum / scores.length,
				sumSum / scores.length,
				avgSum / scores.length);
		System.out.println(line.do_line(lineLength));

	}

}
