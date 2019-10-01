package com.stackroute;

/**
 * Hello world!
 *
 */
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {
        //Using Applicationcontext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie mob = (Movie)context.getBean("movie");
        System.out.println(mob.toString());

        //ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        Movie mob1 = (Movie)context.getBean("movieA");
        System.out.println(mob1.toString());



    }
}
