package com.rameshshoft.listeners1;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class FailedXmlRunner {
	
	public static void main(String[] args) {
		
		List<String>  list  = new ArrayList<String>();
		list.add("C:\\Users\\dzung\\workspace\\SeleniumJavaFramework\\test-output\\testng-failed.xml");
		TestNG test = new TestNG();
		test.setTestSuites(list);
		test.run();
		
	}
}
