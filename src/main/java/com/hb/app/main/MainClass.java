package com.hb.app.main;

import com.hb.config.app.MasterConfig;
import com.hb.config.app.SomeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by harishb on 1/15/16.
 */
// @SpringBootApplication
public class MainClass {
    public static void main(String[] args) {
        // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MasterConfig.class);
        context.refresh();

        SomeService someService = context.getBean(SomeService.class);
        someService.doSomething();
        ;
    }
}
