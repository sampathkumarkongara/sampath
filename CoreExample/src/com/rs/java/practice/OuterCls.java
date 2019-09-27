package com.rs.java.practice;

class AnonOuterCls {

	void m2() {
		System.out.println("m2 method");
	}

	Test t = new Test() {
		void m1() {
			System.out.println("this is annonymus inner class");
		}
	};
}
