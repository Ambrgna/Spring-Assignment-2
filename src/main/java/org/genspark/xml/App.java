package org.genspark.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("Springxml.xml");

        Student stu = (Student) context.getBean("student");
        System.out.println(stu.toString());
    }
}
