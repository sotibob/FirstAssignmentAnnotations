package org.sotibob;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("spring.xml");
        Student s = (Student) context.getBean("student");
        System.out.println(s);
    }
}
