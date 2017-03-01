package com.scujcc.highlight_spring4.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by David on 17/2/26.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }

}
