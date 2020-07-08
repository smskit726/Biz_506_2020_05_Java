package com.biz.bank.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.domain.AccountVO;

public class BankServiceImplV1 implements BankService {
	Scanner scan = new Scanner(System.in);
	Date date;
	SimpleDateFormat dateFormat;
	SimpleDateFormat timeFormat;
	
	List<AccountVO> accountList;
	String num;

	public BankServiceImplV1() {
		accountList = new ArrayList<AccountVO>();
		date = new Date();
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		timeFormat = new SimpleDateFormat("HH:mm:ss");
		
		System.out.println("계좌번호를 입력하세요 >> ");
		num = scan.nextLine();
		System.out.println();
	}

	@Override
	public boolean inputBalance() {

		AccountVO account = new AccountVO();

		String curDate = dateFormat.format(date);
		String curTime = timeFormat.format(date);
		String date = String.format("%s %s", curDate,curTime);
		
		System.out.println("입금액을 입력하세요 (이전화면 : END) >> ");
		String strInput = scan.nextLine();

		if (strInput.equals("END")) {
			return false;
		}
		
		int input = 0;
		try {
			input = Integer.valueOf(strInput);
		} catch (Exception e) {
			System.out.println("입금액은 숫자만 입력가능합니다");
		}

		account.setNum(num);
		account.setDate(date);
		account.setInput(input);
		accountList.add(account);

		return true;
	}

	@Override
	public boolean outputBalance() {

		AccountVO account = new AccountVO();
		
		String curDate = dateFormat.format(date);
		String curTime = timeFormat.format(date);
		String date = String.format("%s %s", curDate,curTime);

		System.out.println("출금액을 입력하세요 (이전화면 : END) >> ");
		String strOutput = scan.nextLine();

		if (strOutput.equals("END")) {
			return false;
		}

		int output = 0;
		try {
			output = Integer.valueOf(strOutput);
		} catch (Exception e) {
			System.out.println("출금액은 숫자만 입력가능합니다");
		}


		account.setNum(num);
		account.setDate(date);
		account.setOutput(output);
		accountList.add(account);

		return true;

	}

	@Override
	public void listBalance() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("계좌\t날짜\t\t\t입금\t출금\t잔액");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		
		int size = accountList.size(); 
		if(size==0) {
			System.out.println("입출금내역이 없습니다 :(");
		}
		for(int i=0; i<size; i++) {
			AccountVO account = accountList.get(i);
			System.out.print(account.getNum()+"\t");
			System.out.print(account.getDate()+"\t");
			System.out.print(account.getInput()+"\t");
			System.out.print(account.getOutput()+"\t");
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("출력 완료! 아무키나 누르세요 :)");
		scan.nextLine();

	}
}
