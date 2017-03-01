package com.scujcc.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by David on 17/3/1.
 */

@Service
public class DemoMethodService {
    public void add(){
        System.out.println("核心逻辑执行(Method)");
    }
}
