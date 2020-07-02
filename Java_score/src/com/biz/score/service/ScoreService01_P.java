package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 * 성적을 입력받아서 scoreList에 저장하고 성적리스트를 출력하는 부분 정의 
 */
public class ScoreService01_P {
	
	// 성적리스트를 저장하기 위한 객체
	List<ScoreVO> scoreList;
	
	// 키보드를 사용해서 값들을 입력받기 위한 객체
	private Scanner scan;
	
	// scoreList, scan 객체를 선언하고 사용할 수 있도록 생성자에서 두 객체를 초기화 한다.
	// 이 과정을 생락하면 NullpointerException이 발생하기 쉽다
	public ScoreService01_P(){
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	// 한 학생의 성적을 입력받아서 scoreList에 추가하는 method
	// 변경
	// 학생의 성적을 입력받는 과정에서 학번에 END라는 문자열을 입력하게 되면 성적 입력을 중단하도록 변경
	public boolean inputScore() {
		
		int intKor=0;
		int intEng=0;
		int intMath=0;
		
		System.out.println("학번(중단 : END) >> ");
		String strID = scan.nextLine();
		
		if(strID.equals("END")) {
			return false;
		}
		
		System.out.println("국어 >> ");
		String strKor = scan.nextLine();
		
		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println(">> 0 ~ 100 사이의 숫자를 입력해주세요");
			System.out.println(">> 입력값이 잘못되어 0으로 임시 저장합니다.");
		}
		
		System.out.println("영어 >> ");
		String strEng = scan.nextLine();
		
		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println(">> 0 ~ 100 사이의 숫자를 입력해주세요");
			System.out.println(">> 입력값이 잘못되어 0으로 임시 저장합니다.");
		}
		
		System.out.println("수학 >> ");
		String strMath = scan.nextLine();
		
		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println(">> 0 ~ 100 사이의 숫자를 입력해주세요");
			System.out.println(">> 입력값이 잘못되어 0으로 임시 저장합니다.");
		}
		// intMath는 0인 상태가 유지가 된다.
		
		// 키보드에 입력받은 점수를 int형으로 변환하여 변수에 담겨서 온상태
		// int형으로 변환된 점수를 ScoreVO에 담기
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setStID(strID);
		scoreVO.setIntKor(intKor);
		scoreVO.setIntEng(intEng);
		scoreVO.setIntMath(intMath);
		
		// 총점계산
		int stSum = scoreVO.getIntKor()+scoreVO.getIntEng()+scoreVO.getIntMath();
		scoreVO.setIntSum(stSum);
		
		// 평균계산을 float형으로 계산하기 위해서 먼저 sum(총점)을 float형으로 변환하고
		// 나눗셈을 수행해서 결과를 도출한다
		float stAvg = (float)stSum/3;
		scoreVO.setFloatAvg(stAvg);
		
		// 한 학생의 성적 입력받아 VO에 담기
		
		scoreList.add(scoreVO);
		
		return true;
	}  // inputScore end
	
	public void scoreList() {
		LineService line = new LineService();
		int lineLength = 50;  // 라인 길이
		
		System.out.println("성적 일람표");
		System.out.println(line.do_line(lineLength));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(line.single(lineLength));
		
		
		// scoreList개수가 몇개인지 파악하여 변수에 저장
		int listSize = scoreList.size();
		for(int i=0; i<listSize; i++) {
			// list에서 scoreVO를 추출한다
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
