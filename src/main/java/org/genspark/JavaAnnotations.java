package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class JavaAnnotations
{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Student stu = (Student) context.getBean("student");
        System.out.println(stu.toString());
    }
}
