package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean  implements InitializingBean , DisposableBean {

    private String  message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

    public void customInit()
    {
        System.out.println("Inside CustomInit");
    }
    public void customDestroy()
    {
        System.out.println("Inside Custom Destroy. Oh My GOd . Don't Destroy me please");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside after property set ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Container got Destroyed. OH MY GOD");
    }
}
