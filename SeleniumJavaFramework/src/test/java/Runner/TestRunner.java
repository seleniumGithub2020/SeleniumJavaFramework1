package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String []args){


		TestNG runner = new TestNG();
		List<String> list = new ArrayList<String>();
		list.add("C:\\Users\\dzung\\workspace\\SeleniumJavaFramework\\test-output\\Smoke TestScenario\\testng-failed.xml");
		runner.setTestSuites(list);
		
		runner.run();
		
	}
}