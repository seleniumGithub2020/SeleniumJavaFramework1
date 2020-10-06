package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo2{

	@Test
	public void test4(){
		System.out.println("I am in side Test 4");
	}
	@Test
	public void test5(){
		System.out.println("I am in side Test 5");
		
	}
	@Test
	public void test6(){
		System.out.println("I am in side Test 6");
		throw new SkipException("This test is skipped");
	}

}
