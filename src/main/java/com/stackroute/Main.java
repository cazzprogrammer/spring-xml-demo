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

        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Movie mob1 = (Movie) factory.getBean("movie");
        System.out.println(mob1.toString());

        //  BeanDefinitionRegistry and BeanDefinitionReader

        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie mob2 = ((DefaultListableBeanFactory)beanDefinitionRegistry).getBean(Movie.class);
        System.out.println(mob2.toString());


    }
}
