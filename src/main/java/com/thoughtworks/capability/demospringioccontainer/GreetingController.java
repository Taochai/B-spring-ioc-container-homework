package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements ApplicationContextAware {

    private ApplicationContext applicationContext;


    @GetMapping("/greet")
    public String greet() {
        return this.applicationContext.getBean(GreetingService.class).sayHi();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
