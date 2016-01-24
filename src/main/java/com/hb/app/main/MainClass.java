package com.hb.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hb.config.app.MasterConfig;
import com.hb.config.app.SomeService;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = MasterConfig.class)
@EnableWebMvc
public class MainClass {

    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }

    public static void main_(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MasterConfig.class);
        //context.register(MasterConfig.class);
        //context.refresh();

        SomeService someService = context.getBean(SomeService.class);
        someService.doSomething();
        someService.someBadMethod();
        System.exit(0);
    }
}
