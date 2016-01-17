package com.hb.config.app;

import com.hb.config.messaging.MessagingConfig;
import com.hd.config.db.DBConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {MasterConfig.class, DBConfig.class, MessagingConfig.class})
public class MasterConfig {
}
