package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo 
{

	public static void main(String[] args) 
	{
		//load the spring configuration file i.e open the IOC container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		CricketCoach theCoach = context.getBean("theCricketCoach",CricketCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//call our new methods to get literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();
	}

}
