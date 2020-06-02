package com.biz.exec;

import com.biz.model.AddressVO;
import com.biz.service.AddrServiceV1;

public class Ex_02 {
	public static void main(String[] args) {
		
		AddressVO[] address = new AddressVO[5];
		
		for(int i =0; i<address.length; i++) {
			address[i] = new AddressVO();
		}
		
		address[0].setName("김OO");
		address[1].setName("이OO");
		address[2].setName("박OO");
		address[3].setName("신OO");
		address[4].setName("정OO");
		
		address[0].setAddr("광주");
		address[1].setAddr("울산");
		address[2].setAddr("대구");
		address[3].setAddr("대전");
		address[4].setAddr("부산");
		
		for(int i=0; i<5; i++) {
			address[i].setTel("010-"+i);
		}
		
		for(int i=0; i<5; i++) {
			address[i].setAge(23+i);
		}
		
		AddrServiceV1 addrService = new AddrServiceV1();
		// 배열을 매개변수를 통해 method에게 전달할 때는 이름만 붙여주면 된다.
		addrService.addrList(address);		
		
	}

}
