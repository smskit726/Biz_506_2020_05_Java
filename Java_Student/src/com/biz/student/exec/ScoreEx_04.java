package com.biz.student.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.Score;
import com.biz.student.domain.Student;

public class ScoreEx_04 {
	public static void main(String[] args) {
		List<Score> scoreList = new ArrayList<Score>();
		List<Student> studentList = new ArrayList<Student>();
		String scoreFile = "src/com/biz/student/exec/score.txt";
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		// File과 관련된 클래스는 객체로  를 분리한다.
		// 선언할때는 null값을 clear만 수행하고 다음으로 진행한다.
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			// 파일을 읽기 위해서 open하는 것
			fileReader = new FileReader(scoreFile);
			// open된 파일에 대한 정보가 담긴 fileReader 객체를
			// buffer에 연결하여 파일을 읽도록 지시한다.
			buffer = new BufferedReader(fileReader);
			
			// 파일을 읽기 전에 파일 한줄의 문자열을 읽어 담을 문자열 변수를 선언
			// 파일을 읽어서 처리할 문자열은 반복문 밖에서 선언하고 초기화 한 후 사용한다.
			String reader = "";
			while(true) {
				reader = buffer.readLine(); // buffer로 부터 파일에서 한줄씩 읽기
				
				if(reader == null) {
					break;  // 파일 끝에 도달했으면 파일 읽기를 그만 멈춰라
				}
				
				String[] scores = reader.split(":");
				Score sVO = new Score();
				sVO.setNum(scores[0]);
				sVO.setIntKor(Integer.valueOf(scores[1]));
				sVO.setIntEng(Integer.valueOf(scores[2]));
				sVO.setIntMath(Integer.valueOf(scores[3]));
				sVO.setIntSum(Integer.valueOf(scores[4]));
				sVO.setFloatAvg(Float.valueOf(scores[5]));
				
				scoreList.add(sVO);
			}
			buffer.close();
			fileReader.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(scoreFile + " 파일을 읽기 위해 open 하는 중 오류 발생!");
			return;
		}catch(NumberFormatException e) {
			System.out.println("점수를 숫자로 바꾸는 과정에서 오류 발생!");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("버퍼로부터 데이터를 읽는데 문제가 발생!");
		}  // try : 파일 읽기 end
		
		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			while(true) {
				reader = buffer.readLine();
				
				if(reader == null) {
					break;
				}
				
				String[] student = reader.split(":");
				Student stdVO = new Student();
				
				stdVO.setNum(student[0]);
				stdVO.setName(student[1]);
				
				studentList.add(stdVO);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("버퍼로부터 데이터를 읽는데 문제가 발생!");
		}
		
		
		/*
		// scoreList에는 score.txt 파일에서 읽은 성적리스트가 들어있다.
		
		// scoreList에 학번 "00010"인 학생의 성적사항을 찾아서 Console출력
		int size = scoreList.size();
		for(int i = 0; i<size; i++) {
			Score sVO = scoreList.get(i);
			if(sVO.getNum().equals("00010")) {
				System.out.println("학번 : " + sVO.getNum());
				System.out.println("국어 : " + sVO.getIntKor());
				System.out.println("영어 : " + sVO.getIntEng());
				System.out.println("수학 : " + sVO.getIntMath());
				break;
			}
		}
		
		// 향상된 for문을 이용하여 Console에 출력
		for(Score sVO : scoreList) {
			if(sVO.getNum().equals("00010")) {
				System.out.println("학번 : " + sVO.getNum());
				System.out.println("국어 : " + sVO.getIntKor());
				System.out.println("영어 : " + sVO.getIntEng());
				System.out.println("수학 : " + sVO.getIntMath());
				break;
			}
		}
		*/
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("성적일람표");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		
		int size = scoreList.size();
		for(Score score : scoreList) {
			System.out.print(score.getNum()+"\t");
			
			for(Student std : studentList) {
				if(score.getNum().equals(std.getNum())) {
					System.out.print(std.getName()+"\t");
					break;
				}
			}
			System.out.print(score.getIntKor()+"\t");
			System.out.print(score.getIntEng()+"\t");
			System.out.print(score.getIntMath()+"\t");
			System.out.print(score.getIntSum()+"\t");
			System.out.print(score.getFloatAvg()+"\n");
		}
		
	}
}
