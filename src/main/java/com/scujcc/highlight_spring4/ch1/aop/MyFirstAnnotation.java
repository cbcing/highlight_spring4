package com.scujcc.highlight_spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by David on 17/3/1.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyFirstAnnotation {
    String name();
}
