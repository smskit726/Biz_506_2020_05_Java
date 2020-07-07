package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.statics.SplitPosition;

public class WordGameServiceImplV1 implements WordGameService{
	protected List<WordVO> wordList;
	protected int count = 0;
	protected int game = 0;
	
	public WordGameServiceImplV1() {
		wordList = new ArrayList<WordVO>();
	}

	@Override
	public void loadWord() {
		// TODO Auto-generated method stub
		String wordFile = "src/com/biz/word/exec/word.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			while(true) {
				reader = buffer.readLine();
				
				if(reader == null) {
					break;
				}
				
				String[] words = reader.split(":");
				WordVO wordVO = new WordVO();
				
				wordVO.setEng(words[SplitPosition.WORD_ENG]);
				wordVO.setKor(words[SplitPosition.WORD_KOR]);
				
				wordList.add(wordVO);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int size = wordList.size();
		while(true) {
			int index = rnd.nextInt(size);
			
			System.out.println("다음에 해당되는 영단어는? (종료 : END)");
			System.out.print(wordList.get(index).getKor() + " >> ");
			String strEng = scan.nextLine();
			
			if(strEng.equals("END")) {
				break;
			}
			game++;
			if(strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("▦▦▦▦▦▦▦▦▦▦▦ 정답입니다 :) ▦▦▦▦▦▦▦▦▦▦▦");
				count++;
			}else {
				System.out.printf("▦▦▦▦▦ 오답입니다 (정답 : %s) ▦▦▦▦▦\n",wordList.get(index).getEng());
			}
			
		}
	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.printf("%d 문제 중 %d 개 맞추셨습니다 :)\n",game,count);
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	

}
