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

public class WordGameServiceImplV2 implements WordGameService {

	protected List<WordVO> wordList;
	protected int game;
	protected int count;

	public WordGameServiceImplV2() {
		// TODO Auto-generated constructor stub
		wordList = new ArrayList<WordVO>();
		game = 0;
		count = 0;
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
			while (true) {
				reader = buffer.readLine();

				if (reader == null) {
					break;
				}

				String[] words = reader.split(":");

				WordVO wVO = new WordVO();
				wVO.setEng(words[SplitPosition.WORD_ENG]); // words[0]
				wVO.setKor(words[SplitPosition.WORD_KOR]); // words[1]
				wordList.add(wVO);
			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽을 수 없습니다.");
			return;

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

		count = 0;
		game = 0;
		while (true) {
			int index = rnd.nextInt(size);
			System.out.println("다음에 해당하는 영어단어는? (종료 : END) ");
			System.out.print(wordList.get(index).getKor() + " >> ");
			String strEng = scan.nextLine();

			if (strEng.equals("END")) {
				break;
			}

			game++;
			if (strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("정답입니다 :)");
				count++;
			} else {
				System.out.println("오답입니다 :(");
				System.out.println(wordList.get(index).getEng());
			}
		}
	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub
		System.out.println("GAME OVER!");
		System.out.printf("%d 게임중 %d 번 정답", game, count);

	}

}
