package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) 
	{
		// load the Spring config file i.e implement the IOC container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve the bean from the container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same object: "+ result);
		
		System.out.println("Memory address of theCoach"+ theCoach);
		
		System.out.println("Memory address of alphaCoach"+ alphaCoach);
		
		//close the context
		context.close();
	}

}
