package com.sample.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2TestTest {

	@Parameters({"V1", "V2"})
	@Test
	public void f(int V1, int V2) {

		int sum = V1+V2;
	}
}
