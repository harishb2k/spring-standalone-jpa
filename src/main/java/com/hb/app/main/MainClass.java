package com.hb.app.main;

import com.hb.config.app.MasterConfig;
import com.hb.config.app.SomeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MasterConfig.class);
        context.refresh();

        SomeService someService = context.getBean(SomeService.class);
        someService.doSomething();
    }
}
