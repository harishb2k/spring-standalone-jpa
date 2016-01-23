package com.hb.app.main;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.hb.config.app.MasterConfig;
import com.hb.config.app.SomeService;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = MasterConfig.class)
public class MainClass {

    /*
    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }
    */

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MasterConfig.class);
        context.refresh();

        SomeService someService = context.getBean(SomeService.class);
        someService.doSomething();
        someService.someBadMethod();
        System.exit(0);
    }
}
