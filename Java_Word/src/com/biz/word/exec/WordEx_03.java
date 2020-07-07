package com.biz.word.exec;

import com.biz.word.service.WordGameService;
import com.biz.word.service.WordGameServiceImplV3;

public class WordEx_03 {
	public static void main(String[] args) {
		WordGameService wService = new WordGameServiceImplV3();
		
		wService.loadWord();
		wService.playGame();
		wService.gameOver();
	}

}
