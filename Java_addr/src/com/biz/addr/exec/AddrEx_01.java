package com.biz.addr.exec;

import com.biz.addr.service.AddrService01;

public class AddrEx_01 {
	public static void main(String[] args) {
		AddrService01 service1 = new AddrService01();
		service1.makeAddr();    // 주소록 생성
		service1.addrList();  // 주소록 출력
	}

}
