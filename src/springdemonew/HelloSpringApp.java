package springdemonew;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        /*Internally, spring will -
        1. Look for applicationContext.xml file at the classpath.
        2. Parse XML, read and store the metadata(bean id, class name, scope and dependencies) for each bean
        3. Create and store the beans (having singleton scope)
        4. Note -  There are 2 strategies of bean initialization in Spring -
           a. Eager Initialization - All beans having singleton scope are eagerly initialzed. This means that
           the Spring container creates and initializes all singleton beans during the application startup process.
           b. Lazy Initialization - It means deferring the creation of a bean until it is first requested by the app.
        5. Internally, Spring behaves something like this -
        class MyContainer {

            Map<String, Object> singletonObjects; //map of all singleton beans/objects
            Map<String, BeanDefinition> beanDefinitions; //map of metadata of all beans

            Object getBean(String name) {

                // already created? - during app startup
                if(singletonObjects.containsKey(name)) {
                    return singletonObjects.get(name);
                }

                // otherwise create it - for lazy beans - only metadata is created during app startup
                //actual bean instantiation happens only when they are requested for the 1st time in the app
                BeanDefinition bd = beanDefinitions.get(name);

                Object obj = createObject(bd);

                singletonObjects.put(name, obj);

                return obj;
    }
}
        */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from the spring container - we are using factory design pattern here
        Coach coach = context.getBean("myCoach", Coach.class);

        //call the method on the bean
        System.out.println(coach.getDailyWorkout());

        //let's call our new method for fetching the diet
        System.out.println(coach.getDailyDiet());

        //close the context - to release any resources - like DB connections,etc, clear cache and to destroy beans
        context.close();
    }
}
