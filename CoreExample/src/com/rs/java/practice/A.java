package com.rs.java.practice;

public class A {

	public void methodA() {
		System.out.println("method of Class A");
	}
}

class C extends A {
	public void methodB() {
		System.out.println("method of Class C");
	}
}

class D extends A {
	public void methodC() {
		System.out.println("method of Class D");
	}
}

class E extends A {
	public void methodD() {
		System.out.println("method of Class E");
	}
}

class JavaExample {
	public static void main(String args[]) {
		C obj1 = new C();
		D obj2 = new D();
		E obj3 = new E();
		// All classes can access the method of class A
		obj1.methodA();
		obj2.methodA();
		obj3.methodA();

	}
}
