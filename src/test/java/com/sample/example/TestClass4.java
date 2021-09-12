package com.sample.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestClass4 {

	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(TestClass1.class,TestClass2.class,TestClass3.class);
		int runCount = runClasses.getRunCount();
	System.out.println(runCount);
		int failureCount = runClasses.getFailureCount();
		System.out.println("failur count is "+failureCount);
	}
}
