package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

public class ScoreService01 {
	List<ScoreVO> scoreList;
	private Scanner scan;
	
	public ScoreService01(){
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	public boolean inputScore() {
		
		int intKor=0;
		int intEng=0;
		int intMath=0;
		
		System.out.println("학번(중단 : END) >> ");
		String strID = scan.nextLine();
		
		if(strID.equals("END")) {
			return false;
		}
		
		while(true) {
			System.out.println("국어 >> ");
			String strKor = scan.nextLine();
			
			try {
				intKor = Integer.valueOf(strKor);
			} catch (Exception e) {
				System.out.println(">> 0 ~ 100 사이의 숫자를 입력해주세요");
				System.out.println(">> 입력값이 잘못되어 0으로 임시 저장합니다.");
			}
			
			if(intKor>=0 && intKor<=100) {
				break;
			}else {
				System.out.println(">> 0 ~ 100 사이의 숫자를 입력해주세요");
			}
		}
		
		while(true) {
			System.out.println("영어 >> ");
			String strEng = scan.nextLine();
			
			try {
				intEng = Integer.valueOf(strEng);
			} catch (Exception e) {
				System.out.println(">> 0 ~ 100 사이의 숫자를 입력해주세요");
				System.out.println(">> 입력값이 잘못되어 0으로 임시 저장합니다.");
			}
			
			if(intEng>=0 && intEng<=100) {
				break;
			}else {
				System.out.println(">> 0 ~ 100 사이의 숫자를 입력해주세요");
			}
		}
		
		while(true) {
			System.out.println("수학 >> ");
			String strMath = scan.nextLine();
			
			try {
				intMath = Integer.valueOf(strMath);
			} catch (Exception e) {
				System.out.println(">> 0 ~ 100 사이의 숫자를 입력해주세요");
				System.out.println(">> 입력값이 잘못되어 0으로 임시 저장합니다.");
			}
			
			if(intMath>=0 && intMath<=100) {
				break;
			}else {
				System.out.println(">> 0 ~ 100 사이의 숫자를 입력해주세요");
			}
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setStID(strID);
		scoreVO.setIntKor(intKor);
		scoreVO.setIntEng(intEng);
		scoreVO.setIntMath(intMath);
		
		int stSum = intKor+intEng+intMath;
		scoreVO.setIntSum(stSum);
		
		float stAvg = (float)stSum/3;
		scoreVO.setFloatAvg(stAvg);
		
		scoreList.add(scoreVO);
		
		return true;
	}
	
	public void scoreList() {
		LineService line = new LineService();
		int lineLength = 50;
		
		System.out.println("성적리스트");
		System.out.println(line.do_line(lineLength));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(line.single(lineLength));
		
		int listSize = scoreList.size();
		for(int i=0; i<listSize; i++) {
			ScoreVO score = scoreList.get(i);
			System.out.print(score.getStID()+"\t");
			System.out.print(score.getIntKor()+"\t");
			System.out.print(score.getIntEng()+"\t");
			System.out.print(score.getIntMath()+"\t");
			System.out.print(score.getIntSum()+"\t");
			System.out.print(score.getFloatAvg()+"\n");
		}
		System.out.println(line.do_line(lineLength));
	}

}
