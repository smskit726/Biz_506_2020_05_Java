package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 * ScoreService**** 클래스를 정의할때
 * 반드시 ScoreService interface를 참조(implements)하도록 규칙을 정해 놓는다.
 * ScoreService interface를 참조하는 클래스는 ScoreService interface에 디자인된 method를
 * 모두 implement해서 작성되어야 하는 규칙이 작동하게 된다.
 * 따라서 모든 method의 이름이 통일되는 효과를 얻게된다.
 * 
 * interface(ScoreService)를 implements하여 작성된 클래스는
 * interface에 정의된 method의 규칙을 그대로 준수하여 작성해야 의무가 있는 클래스이다.
 * 모양은 interface의 모양을 그대로 가지고 있으며 하는일은 실제 클래스의 method에 구현되어 있다.
 */

public class ScoreServiceImplV1 implements ScoreService{
	// private 되어 있던 필드변수를 protected로 변경했다.
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public boolean inputScore() {
		ScoreVO scoreVO = new ScoreVO();
		
		int intKor=0;
		int intEng=0;
		int intMath=0;
		
		System.out.println("학번 (중단 :END) >>");
		String stID = scan.nextLine();
		
		if(stID.equals("END")) {
			return false;
		}
		
		System.out.println("국어 >>");
		String strKor = scan.nextLine();
		
		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("Warning : 1 ~ 100 사이의 숫자를 입력해주세요");
			System.out.println("입력값이 잘못되어 0으로 임시 저장합니다.");
		}
		
		System.out.println("영어 >>");
		String strEng = scan.nextLine();
		
		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("Warning : 1 ~ 100 사이의 숫자를 입력해주세요");
			System.out.println("입력값이 잘못되어 0으로 임시 저장합니다.");
		}
		
		System.out.println("수학 >>");
		String strMath = scan.nextLine();
		
		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("Warning : 1 ~ 100 사이의 숫자를 입력해주세요");
			System.out.println("입력값이 잘못되어 0으로 임시 저장합니다.");
		}
		
		scoreVO.setNum(stID);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		
		scoreList.add(scoreVO);
		
		return true;
	}

	@Override
	public void calcSum() {
		int size = scoreList.size();
		for(int i =0; i<size; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			int sum = scoreVO.getKor()+scoreVO.getEng()+scoreVO.getMath();
			
			/*
			 * scoreVO.setSum() method에 총점을 전달함으로써 scoreList에 저장된 요소의 총점 변수에 값을 저장하는 효과를 낸다.
			 * 별도로 저장을 해주거나 하는 절차가 필요없다.
			 */
			scoreVO.setSum(sum);
		}
		
	}

	@Override
	public void calcAvg() {
		int size = scoreList.size();
		int subNum = 3;
		
		for(int i = 0; i<size; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			int avg = scoreVO.getSum()/subNum;
			scoreVO.setAvg(avg);
		}
		
	}

	@Override
	public void scoreList() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("성적 일람표");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		
		int size = scoreList.size();
		for(int i=0; i<size; i++) {
			ScoreVO score = scoreList.get(i);
			System.out.print(score.getNum()+"\t");
			System.out.print(score.getKor()+"\t");
			System.out.print(score.getEng()+"\t");
			System.out.print(score.getMath()+"\t");
			System.out.print(score.getSum()+"\t");
			System.out.print(score.getAvg()+"\n");
		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}

}
