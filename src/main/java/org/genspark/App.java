package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args ){

        System.out.println("Java Annotations with xml");
        JavaAnnotations.main(null);
        System.out.println("Java Config");
        JavaConfig.main(null);
    }
}
