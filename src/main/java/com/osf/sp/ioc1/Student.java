package com.osf.sp.ioc1;

public class Student {

	// 의존성주입
	// 1. 코드
	private Person p = new Person();
	
	// 2. 생성자
	public Student(Person p) {
		this.p = p;
	}
	
	// 3. 세터
//	public void setP(Person p) {
//		this.p = p;
//	}
}

