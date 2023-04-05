package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class JavaConfig
{
    public static void main( String[] args ){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student stu = (Student) context.getBean(Student.class);
        System.out.println(stu.toString());
    }
}
