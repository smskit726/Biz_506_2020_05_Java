package com.biz.classes;

import com.biz.classes.model.Student;

public class ClassEx_02 {
	public static void main(String[] args) {
		
		// 지금 작성한 Student클래스를 사용하여 인스턴스 작성
		// main() method가 없는 클래스는 main() method 내에서 변수처럼 선언하고 생성을 해주어야 한다.
		// 이 때, 클래스를 사용해서 만든 변수를 객체(Object), 인스턴스 라고 한다.
		// 인스턴스는 변수와 유사하지만 사용법이 다소 다르다.
		// 변수는 값을 저장하는 공간을 제공하는 역할을 수행하지만, 인스턴스는 값을 저장하는 공간과 값을 연산하는 기능(행동)을 같이 가지고 있다.
		Student student = new Student();
		
		// 클래스에 선언된 method를 호출하여 연산을 수행하는 방법
		student.setName();
		
		// 클래스에 선언된 멤버변수에 값을 저장하기
		student.name = "홍길동";
		
		// 클래스에 선언된 멤버변수에 저장된 값을 읽기
		System.out.println(student.name);
		
		// 멤버변수에 public 키워드가 있으면 인스턴스를 통해서 변수에 값을 저장하거나 값을 읽을 수 있다.
		// 멤버변수에 private 키워드가 있으면 인스턴스를 통해서 변수에 접근할 수 없다.
		
		// 멤버변수에 접근제한자를 붙이지 않은면 클래스가 저장된 패키지에 따라서 public으로 인식되기도 하고, private로 인식되기도 한다.
		// 서로 다른 package에서는 private으로 인식된다.
		// student.rem = "접근제한자 없음"
		
		
	}

}
