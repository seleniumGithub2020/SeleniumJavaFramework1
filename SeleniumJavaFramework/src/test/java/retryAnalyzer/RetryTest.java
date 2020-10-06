package retryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class RetryTest {
	
	private static int counter= 0;
 
	@Test
	public void method1()
	{
		counter++;
		if(counter <= 2)
		{
			System.out.println("Failing method purposefully.");
			Assert.fail("Purposefully failing");
		}
			
		System.out.println("Test passed");
	}
 
	
}