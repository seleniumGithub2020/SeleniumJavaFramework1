package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		
		System.out.println("Hello World...! \n ");
		
		logger.trace("This is trace messsage");
		logger.info("this is information messsage");
		logger.error("This is an error messsage");
		logger.warn("this is a warming masseage");
		logger.fatal("this is a fatal masseage");
		
		System.out.println("completed");
		

	}

}
