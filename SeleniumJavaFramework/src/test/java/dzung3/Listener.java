package dzung3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public  class Listener implements ITestListener   
{  

	public void onTestStart(ITestResult result) {  
		// TODO Auto-generated method stub  
	}  


	public void onTestSuccess(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Success of test cases and its details are : "+result.getName());  
	}  


	public void onTestFailure(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  


	public void onTestSkipped(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Skip of test cases and its details are : "+result.getName());  
	}



	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Failure of test cases and its details are : "+result.getName());  
	}

//??????
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}  
}