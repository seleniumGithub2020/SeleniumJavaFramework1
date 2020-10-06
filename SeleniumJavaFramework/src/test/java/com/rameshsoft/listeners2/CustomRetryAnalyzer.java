package com.rameshsoft.listeners2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetryAnalyzer implements IRetryAnalyzer {

	int retryCount=0;
	int maxRetryCount=4;

	//@Override
	public boolean retry(ITestResult result){

		if(ITestResult.FAILURE==result.getStatus()&&retryCount<=maxRetryCount){
		//if(retryCount<=maxRetryCount){

			try{
				Thread.sleep(3000);
				System.out.println("count is: " + retryCount+ "executing TC: " + result.getName());
				retryCount++;
				return true;
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		return false;

	}
}
