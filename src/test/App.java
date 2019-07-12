package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		/*- ApplicationContext context = new ClassPathXmlApplicationContext("test/spring.xml");
		
		Computer computer = (Computer) context.getBean("computer");
		computer.getStatus();
		
		((ClassPathXmlApplicationContext) context).close();*/

		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

		Computer computer = (Computer) context.getBean("computer");
		computer.getStatus();

		((AnnotationConfigApplicationContext) context).close();

	}

}
