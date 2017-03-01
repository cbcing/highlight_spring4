package com.scujcc.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by David on 17/3/1.
 */

@Configuration
@ComponentScan("com.scujcc.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
