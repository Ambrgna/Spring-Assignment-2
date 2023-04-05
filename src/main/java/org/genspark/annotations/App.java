package org.genspark.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("Springann.xml");

        Student stu = (Student) context.getBean("student");
        System.out.println(stu.toString());
    }
}
