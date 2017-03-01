package com.scujcc.highlight_spring4.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by David on 17/2/26.
 */

@Configuration
@ComponentScan("com.scujcc.highlight_spring4.ch2.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }

}
