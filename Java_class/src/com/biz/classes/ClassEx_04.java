package com.biz.classes;

import com.biz.classes.model.Address;

public class ClassEx_04 {
	public static void main(String[] args) {
		
		Address address = new Address();
		
		// city 변수는 private이기 때문에 인스턴스를 통해서 직접접근이 불가능하다.
		// address.city = "광주광역시"
		
		// city 변수에 값을 저장하기 위한 setter method()를 사용하여 값을 저장하기
		address.setCity("광주광역시");
		
		// city 변수에서 값을 읽기 위한 getter method()를 사용하여 값을 가져오기
		String city = address.getCity();
		address.setCity("서울특별시");
		System.out.println(city);
		
	}

}
