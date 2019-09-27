package com.rs.java.practice;

class Outer {
	private int a = 100;

	void m1() {
		class Inner {
			void innerMethod() {
				System.out.println("this is inner class method");
				System.out.println(a);
			}
		}
		Inner i = new Inner();
		i.innerMethod();
	}
}
