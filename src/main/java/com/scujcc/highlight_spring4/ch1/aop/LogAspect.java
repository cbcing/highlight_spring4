package com.scujcc.highlight_spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by David on 17/3/1.
 */

@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.scujcc.highlight_spring4.ch1.aop.MyFirstAnnotation)")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        MyFirstAnnotation myFirstAnnotation = method.getAnnotation(MyFirstAnnotation.class);
        System.out.println("注解式拦截 " + myFirstAnnotation.name());
    }

    @Before("execution(* com.scujcc.highlight_spring4.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式被拦截 " + method.getName());
    }

}
