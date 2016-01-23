package com.hb.config.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hb.config.messaging.MessagingConfig;
import com.hd.config.db.DBConfig;

@Configuration
@ComponentScan(basePackageClasses = {MasterConfig.class, DBConfig.class, MessagingConfig.class})
public class MasterConfig {
	int i;
} 
