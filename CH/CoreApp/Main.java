package CH.CoreApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		AbstractApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
//		ap.registerShutdownHook();
//		Office emp=ap.getBean("off",Office.class);
//		System.out.println(emp);
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(Annotated.class);
		System.out.println(ac.getBean(Office.class));
		ac.registerShutdownHook();
	}
	
}
