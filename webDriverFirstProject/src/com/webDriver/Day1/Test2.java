package com.webDriver.Day1;

public class Test2 {
	
	public static void main(String[] args) {
		
		// Object creation
		// ClassName ObjectName = new ClassName();
		
		Test2 testObj = new Test2();
		System.out.println(testObj);
		testObj.add();
		testObj.sub();
		System.out.println("This is mul function");
		System.out.println("This is div function");
	}
	
	// accessmodifier returntype methodname ();
	public void add() {
		System.out.println("This is add function");
	}
	public void sub() {
		System.out.println("This is sub function");
	}
}
