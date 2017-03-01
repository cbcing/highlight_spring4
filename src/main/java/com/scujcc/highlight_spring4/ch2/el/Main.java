package com.scujcc.highlight_spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by David on 17/2/26.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();
    }

}
