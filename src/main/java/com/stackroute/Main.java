package com.stackroute;

/**
 * Hello world!
 *
 */
import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main
{
    public static void main( String[] args )
    {


        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean beanLifecycleDemoBean = (BeanLifecycleDemoBean)context1.getBean("BeanLifecycleDemoBean");
        System.out.println(beanLifecycleDemoBean.toString());

        context1.registerShutdownHook();

    }
}
