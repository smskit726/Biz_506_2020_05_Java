package com.biz.student.exec;

import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV1;

public class StudentEx_01 {
	public static void main(String[] args) {
		StudentService stList = new StudentServiceImplV1();
		
		while(true) {
			if(!stList.inputStudent()) {
				break;
			}
		}
		
		stList.StudentList();
		
	}
}
