package com.biz.word.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordGameServiceImplV3 extends WordGameServiceImplV2{

	/*
	 * List, ArrayList와 같은 클래스류를 Collection이라고 한다.
	 * 다수의 데이터를 담을 수 있는 클래스들이며, VO들을 담아서 연산을 수행하는 목적으로 사용한다.
	 * 
	 * Collection 클래스들은 Collections라는 클래스의 자손들이다.
	 * 
	 */
	
	
	// List<WordVO> wordList, count, game;
	// loadGame(), playGame(), gameOver() 를 상속받는다
	
	//playGame() 재정의
	@Override
	public void playGame() {
		Scanner scan = new Scanner(System.in);
		count = 0;
		game = 0;
		while(true) {
			
			// shuffle() 을 사용하여 wordList를 뒤섞고 그 중 0번째 위치의 값을 추출한다.
			// 데이터가 최소 1개가 있다면 0번째 값을 추출 시 오류가 날 확률이 적다
			Collections.shuffle(wordList);
			WordVO wordVO = wordList.get(0);
			
			// VO에서 영단어를 추출하여 split()으로 분해한 후 word배열에 담기
			String[] words = wordVO.getEng().split("");
			List<String> wordList = Arrays.asList(words);
			Collections.shuffle(wordList);
			
			System.out.println("다음 알파벳을 단어 순서에 맞게 나열하시오 (종료 : END)");
			System.out.print(wordList);
			String strInput = scan.nextLine();
			
			if(strInput.equals("END")) {
				break;
			}
			
			if(wordVO.getEng().equalsIgnoreCase(strInput)) {
				System.out.println("정답입니다 :)");
				System.out.print(wordVO.getEng()+" / ");
				System.out.println(wordVO.getKor());
				count++;
			}else {
				System.out.println("오답입니다 :(");
				System.out.print(wordVO.getEng()+"\t");
				System.out.println(wordVO.getKor());
			}
			
		}
	}	
	
	

}
