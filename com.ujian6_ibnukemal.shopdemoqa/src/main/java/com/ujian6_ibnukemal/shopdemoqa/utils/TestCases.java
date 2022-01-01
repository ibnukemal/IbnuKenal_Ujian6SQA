package com.ujian6_ibnukemal.shopdemoqa.utils;

public enum TestCases {


	T1("Testing Register"),
	T2("Testing Login"),
	T3("Testing Shoes Item"),
	T4("Testing Glass Item"),
	T5("Testing Checkout");
	
	
	private String testName;
	
	TestCases(String value) {
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
