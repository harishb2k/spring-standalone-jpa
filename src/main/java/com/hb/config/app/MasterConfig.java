package com.hb.config.app;

import com.hd.config.db.DBConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {MasterConfig.class, DBConfig.class})
public class MasterConfig {
}
