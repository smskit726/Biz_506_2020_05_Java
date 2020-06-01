package com.biz.classes.service;

import com.biz.classes.model.BankVO;

public class BankService {
	
	public void bankList(BankVO[] bankList) {
		
		LineService lineService = new LineService();
		String s_line = lineService.single(50);
		String d_line = lineService.do_line(50);
		
		System.out.println(d_line);
		System.out.println("계좌\t날짜\t\t입금\t출금\t잔액");
		System.out.println(s_line);
		
		bankList[0].setIntValance(bankList[0].getIntInput()-bankList[0].getIntOutput());
		for(int i=1; i<bankList.length; i++) {
			bankList[i].setIntValance(bankList[i-1].getIntValance()+bankList[i].getIntInput()-bankList[i].getIntOutput());
		}
		
		for(int i=0; i<bankList.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",bankList[i].getStrNum(),bankList[i].getStrDate(),bankList[i].getIntInput(),bankList[i].getIntOutput(),bankList[i].getIntValance());
		}
		
		
	}
}
