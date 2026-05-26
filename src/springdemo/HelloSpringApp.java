package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp 
{

	public static void main(String[] args) 
	{
		//load the spring configuration file -> i.e implement the container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//the retrieved bean will have all the dependencies covered
		
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call the new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}

}
