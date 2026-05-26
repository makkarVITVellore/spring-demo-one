package springdemonew;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //load the IOC container/config file - we can load multiple files (separated by comma)
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("beanScopeRevision-applicationContext.xml");

        //retrieve the bean from the container
        Coach theCoach = ctx.getBean("myCoach", Coach.class);
        Coach alphaCoach = ctx.getBean("myCoach", Coach.class);

        //check if above 2 beans are the same - by default the scope of a bean is singleton
        boolean result = (theCoach==alphaCoach);

        //print out the results
        System.out.println("\nPointing to the same object: "+result);

        System.out.println("\nMemory location for theCoach: "+theCoach);

        System.out.println("\nMemory location for theCoach: "+alphaCoach +"\n");

        //close the context
        ctx.close();

    }
}
