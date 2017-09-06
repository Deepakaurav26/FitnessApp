package com;

public class StudentService {

	public static void getName() {
		Student student = new Student();
		System.out.println(student.getRollnumber());
	}

	
	public static void main(String[] args) {
		StudentService.getName();
	}
}
