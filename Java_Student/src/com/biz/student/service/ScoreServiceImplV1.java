package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.Score;
import com.biz.student.domain.Student;

public class ScoreServiceImplV1 implements ScoreService{
	protected List<Student> studentList;
	protected List<Score> scoreList;
	
	public ScoreServiceImplV1() {
		studentList = new ArrayList<Student>();
		scoreList = new ArrayList<Score>();
	}

	@Override
	public void inputStudent() {
		// TODO Auto-generated method stub
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			
			while(true) {
				reader = buffer.readLine();
				
				if(reader==null) {
					break;
				}
				
				String[] student = reader.split(":");
				Student stdVO = new Student();
				
				stdVO.setNum(student[SplitPos.STUDENT.ST_NUM]);
				stdVO.setName(student[SplitPos.STUDENT.ST_NAME]);
				studentList.add(stdVO);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(studentFile + " 파일을 읽기 위해 open 하는 중 오류 발생!");
			e.printStackTrace();
		}catch(NumberFormatException e) {
			System.out.println("점수를 숫자로 바꾸는 과정에서 오류 발생!");
		} catch (IOException e) {
			System.out.println("버퍼로부터 데이터를 읽는데 문제가 발생!");
		}
		
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		String scoreFile = "src/com/biz/student/exec/score.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			while(true) {
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				String[] score = reader.split(":");
				Score scoreVO = new Score();
				
				scoreVO.setNum(score[0]);
				scoreVO.setIntKor(Integer.valueOf(SplitPos.SCORE.SC_KOR));
				scoreVO.setIntEng(Integer.valueOf(SplitPos.SCORE.SC_ENG));
				scoreVO.setIntMath(Integer.valueOf(SplitPos.SCORE.SC_MATH));
				// scoreVO.setIntSum(Integer.valueOf(score[4]));
				// scoreVO.setFloatAvg(Float.valueOf(score[5]));
				
				scoreList.add(scoreVO);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(scoreFile + " 파일을 읽기 위해 open 하는 중 오류 발생!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("버퍼로부터 데이터를 읽는데 문제가 발생!");
		}
		
	}

	@Override
	public void calcSum() {
		// TODO Auto-generated method stub
		int scoreSize = scoreList.size();
		int intSum;
		for(int i=0; i<scoreSize; i++) {
			Score scoreVO = scoreList.get(i);
			intSum = scoreVO.getIntKor() + scoreVO.getIntMath() + scoreVO.getIntEng();
			scoreVO.setIntSum(intSum);
		}
	}

	@Override
	public void calcAvg() {
		// TODO Auto-generated method stub
		int scoreSize = scoreList.size();
		int subLength = 3; // 과목 수
		float floatAvg;
		for(int i=0; i<scoreSize; i++) {
			Score scoreVO = scoreList.get(i);
			floatAvg = (float)scoreVO.getIntSum()/subLength;
			scoreVO.setFloatAvg(floatAvg);
		}
	}

	@Override
	public void scoreList() {
		// TODO Auto-generated method stub
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("성적리스트");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");

		// data의 Join
		// scoreList, studentList Join해서 데이터를 출력하는 코드
		for(Score score : scoreList) {
			System.out.print(score.getNum()+"\t");
			
			// 이름
			// score의 학번으로 studentList에서 찾기
			for(Student std : studentList) {
				
				// 학번이 같은 학생의 정보를 찾았으면
				if(score.getNum().equals(std.getNum())) {
					System.out.print(std.getName()+"\t");
					break;
				}
			}
			System.out.print(score.getIntKor()+"\t");
			System.out.print(score.getIntEng()+"\t");
			System.out.print(score.getIntMath()+"\t");
			System.out.print(score.getIntSum()+"\t");
			System.out.printf("%5.2f\n",score.getFloatAvg());
		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}

}
