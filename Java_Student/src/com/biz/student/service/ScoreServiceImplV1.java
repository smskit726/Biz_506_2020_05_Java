package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.Score;
import com.biz.student.domain.Student;

public class ScoreServiceImplV1 implements ScoreService{
	protected List<Student> studentList;
	protected List<Score> scoreList;
	
	public ScoreServiceImplV1() {
		studentList = new ArrayList();
		scoreList = new ArrayList();
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
				
				stdVO.setNum(student[0]);
				stdVO.setName(student[1]);
				
				studentList.add(stdVO);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
				
				scoreVO.setIntKor(Integer.valueOf(score[1]));
				scoreVO.setIntENG(Integer.valueOf(score[2]));
				scoreVO.setIntMath(Integer.valueOf(score[3]));
				scoreVO.setIntSum(Integer.valueOf(score[4]));
				scoreVO.setFlaotAvg(Float.valueOf(score[5]));
				
				scoreList.add(scoreVO);
				
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
			if(intSum != scoreVO.getIntSum()) {
				scoreVO.setIntSum(intSum);
			}
		}
		
	}

	@Override
	public void calcAvg() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		int scoreSize = scoreList.size();
		int intSum;
		float floatAvg;
		for(int i=0; i<scoreSize; i++) {
			Score scoreVO = scoreList.get(i);
			intSum = scoreVO.getIntKor() + scoreVO.getIntMath() + scoreVO.getIntEng();
			floatAvg = Float.valueOf(df.format((float)intSum/3));
			if(floatAvg!=scoreVO.getFlaotAvg()) {
				scoreVO.setFlaotAvg(floatAvg);
			}
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
		
		int scoreSize = scoreList.size();
		Score scoreVO;
		Student stdVO;
		
		for(int i=0; i<scoreSize; i++) {
			scoreVO = scoreList.get(i);
			stdVO = studentList.get(i);
			
			System.out.print(stdVO.getNum() + "\t");
			System.out.print(stdVO.getName() + "\t");
			System.out.print(scoreVO.getIntKor() + "\t");
			System.out.print(scoreVO.getIntEng() + "\t");
			System.out.print(scoreVO.getIntMath() + "\t");
			System.out.print(scoreVO.getIntSum() + "\t");
			System.out.print(scoreVO.getFlaotAvg() + "\n");
		}
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}

}
