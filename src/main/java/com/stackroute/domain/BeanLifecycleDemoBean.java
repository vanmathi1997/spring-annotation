package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Initialisation");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroy");
    }
    public void customBeanInit()
    {
        System.out.println("Custom Bean Initialisation");
    }
    public void customBeanDestroy()
    {
        System.out.println("Custom Bean Destroy");
    }
}
