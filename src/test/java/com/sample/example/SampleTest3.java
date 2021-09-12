package com.sample.example;

import org.testng.annotations.DataProvider;
import org.testng.collections.Objects;

public class SampleTest3 {

	
	@DataProvider(name="testData")
public static Object[][] getTestData() {

return new Object[][] {
	
	{"Iphone Mobile phone"},{"Samsung Phone Mobile"},{"headphone"}
};

}
}
