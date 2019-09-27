package com.rs.java.practice;

public class InnerCls {
	private int a = 100;

	class Inner {
		void data() {
			System.out.println("the value is :" + a);
		}
	}

}
