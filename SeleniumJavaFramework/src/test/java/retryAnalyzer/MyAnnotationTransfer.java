package retryAnalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
 
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import com.rameshsoft.listeners.CustomRetryAnalyzer;
 
public class MyAnnotationTransfer implements IAnnotationTransformer{
 
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		
		IRetryAnalyzer analyzer = annotation.getRetryAnalyzer();
		
		if(analyzer==null){
		annotation.setRetryAnalyzer(RetrySetup.class);
		
	}
 
}
}


/*
IRetryAnalyzer analyzer = annotation.getRetryAnalyzer();
if(analyzer==null){
	annotation.setRetryAnalyzer(CustomRetryAnalyzer.class);
}

*/