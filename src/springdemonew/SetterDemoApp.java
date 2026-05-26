package springdemonew;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //Load the Spring IOC Container/Config file
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from the container
        Coach coach = ctx.getBean("myTrackCoach", Coach.class);

        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyDiet());

        //call getter methods to see if literal values are getting set or not
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        //close the context
        ctx.close();
    }
}
