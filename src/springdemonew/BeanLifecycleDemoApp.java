package springdemonew;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
    public static void main(String[] args) {

        //load the IOC container/config file - we can load multiple files (separated by comma)
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("beanLifecycleRevision-applicationContext.xml");

        //retrieve the bean from the container
        Coach theCoach = ctx.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        ctx.close(); // -> this triggers the destroy methods for each and every bean

        /*This is what happens when we close the container -
        * 1. We initiate container shutdown by calling ctx.close();
        * 2. Container looks for all SINGLETON beans.
        * 3. For every singleton bean, container invokes its custom destroy method.
        * 4. Container removes all bean instances from its cache.
          5. Note - Spring only manages the destruction lifecycle for Singleton beans. If your bean is scoped as a Prototype,
          *  Spring instantiates it, hands it to you, and completely forgets about it.
          * Spring will never call a destroy method on a prototype bean.*/

        /*This is what happens when we initialize the container -
         * 1. The container(ApplicationContext object) locates and reads your XML file.
         * 2, Parse XML, read and store the metadata(bean id, class name, scope and dependencies) for each bean.
         * 3. Spring reads the external properties file and replaces placeholders like ${coach.email} with actual
         *    values.
         * 4. Create and store the beans (having singleton scope)
         * 5. As part of step 4, Spring allocates memory and calls the standard Java constructor of the bean class.
         * 6. Spring looks at the XML/annotations and injects all the required dependencies using setter methods
         * or constructor/field injection.
         * 7. Now that the bean is fully constructed, its dependencies are injected, Spring calls the dedicated initialization method.
         * 8. Now bean is ready for use!*/

    }
}
