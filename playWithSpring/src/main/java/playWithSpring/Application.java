package playWithSpring;

import org.apache.log4j.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	/**
	 * This is just a logger
	 */
	static final Logger logger = Logger.getLogger(Application.class);
	String name;
	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("/Spring/application-context.xml");
		Message msg = (Message) ac.getBean("message");
		System.out.println(msg.getMessage());
		logger.info("I am getting called");
		logger.debug("I am now debug");
		logger.error("I am error");
		
		
		Dog dog= (Dog) ac.getBean("dog");
		System.out.println(dog.getCollar().getSize());
	}
}
