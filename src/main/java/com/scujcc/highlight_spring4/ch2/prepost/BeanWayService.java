package com.scujcc.highlight_spring4.ch2.prepost;

/**
 * Created by David on 17/2/26.
 */
public class BeanWayService {

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destory(){
        System.out.println("@Bean-destory-method");
    }

}
