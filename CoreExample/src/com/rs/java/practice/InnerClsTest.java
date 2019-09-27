package com.rs.java.practice;

public class InnerClsTest {
	public static void main(String[] args) {
		InnerCls o = new InnerCls();
		InnerCls.Inner i = o.new Inner();
		i.data();
	}

}
