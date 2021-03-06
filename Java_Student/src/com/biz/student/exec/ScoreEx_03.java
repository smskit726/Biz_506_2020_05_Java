package com.biz.student.exec;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;

/*
 * 학번, 국어, 영어, 수학, 총점, 평균 데이터를 생성하여 엑셀에서 열어서 사용할 수 있도록 파일을 작성
 * 엑셀은 xls, xlsx 파일 외에 *.csv라는 파일을 읽어서 엑셀데이터처럼 취급할 수 있는데
 * *.csv 파일은 콤마(,)로 데이터들을 구분하는 문자열로 만들고
 * 그 내용을 text 형식으로 저장하면 된다.
 */
public class ScoreEx_03 {
	public static void main(String[] args) {
		
		PrintWriter outPut = null; // = System.out;
		String outFile = "src/com/biz/student/exec/score.txt";
		
		// 지금부터 outFile 변수에 저장된 파일이름으로 Text를 기록하기 위해 파일을 만들어라
		
		try {
			outPut = new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Random rnd = new Random();
		
		for(int i = 0; i < 30; i++) {
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			
			int intSum = intKor+intEng+intMath;
			float floatAvg = (float)intSum/3;
			
			// System.out.printf()
			// %05d => 자릿수 5개를 만들고 앞을 0으로 채워라, %06.2f => 자릿수 6개를 만들고 소수점이하 2번째 자리까지, 앞은 0으로 채워라
			String score = String.format("%05d:%d:%d:%d:%d:%06.2f",i+1,intKor,intEng,intMath,intSum,floatAvg);
			
			outPut.println(score);
		}
		
		outPut.close();
		System.out.println("완료 :)");
	}

}
