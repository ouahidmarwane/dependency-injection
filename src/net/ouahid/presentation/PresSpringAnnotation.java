package net.ouahid.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void  main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.ouahid.dao","net.ouahid.metier");
    }
}
