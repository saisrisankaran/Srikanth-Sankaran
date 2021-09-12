package com.sample.example;

import org.testng.annotations.DataProvider;

public class DataProviderDiffClass {

	@DataProvider(name="TestData")
	public Object[][] methodname(){
		
		return new Object[][] {
			{"Srikanth", "Ramya"},{"bala", "meenu"},{"Sankaran","Lakshmi"}
		};
	}
}
