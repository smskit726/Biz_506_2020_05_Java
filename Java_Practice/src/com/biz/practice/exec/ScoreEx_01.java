package com.biz.practice.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.practice.model.ScoreVO;
import com.biz.practice.service.ScoreServiceV1;

public class ScoreEx_01 {
	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		Random rnd = new Random();
		
		int stNum = 10;
		for(int i=0; i<stNum; i++) {
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setName(""+i);
			scoreVO.setKor(rnd.nextInt(50)+51);
			scoreVO.setEng(rnd.nextInt(50)+51);
			scoreVO.setMath(rnd.nextInt(50)+51);
			scoreVO.setMusic(rnd.nextInt(50)+51);
			scoreList.add(scoreVO);
		}
		
		ScoreServiceV1 sService = new ScoreServiceV1();
		sService.setScoreVO(scoreList);
		sService.stSum();
		sService.stAvg();
		sService.scoreList();
		sService.subSumAvg();
		
	}
}
