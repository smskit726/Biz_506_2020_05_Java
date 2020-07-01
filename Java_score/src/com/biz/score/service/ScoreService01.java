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
		
		int intID=0;
		int intKor=0;
		int intEng=0;
		int intMath=0;
		
		System.out.println("학번(중단 : END) >> ");
		String strID = scan.nextLine();
		
		if(strID.equals("END")) {
			return false;
		}
		
		try {
			intID = Integer.valueOf(strID);
			
		} catch (Exception e) {
			System.out.println(">> 모든 항목은 숫자만 입력 가능합니다");
		}
		
		System.out.println("국어 >> ");
		String strKor = scan.nextLine();
		
		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println(">> 모든 항목은 숫자만 입력 가능합니다");
		}
		
		System.out.println("영어 >> ");
		String strEng = scan.nextLine();
		
		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println(">> 모든 항목은 숫자만 입력 가능합니다");
		}
		
		System.out.println("수학 >> ");
		String strMath = scan.nextLine();
		
		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println(">> 모든 항목은 숫자만 입력 가능합니다");
		}
		
		
		
		
		return true;
	}

}
