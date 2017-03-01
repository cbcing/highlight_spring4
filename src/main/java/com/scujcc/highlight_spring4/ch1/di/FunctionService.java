package com.scujcc.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by David on 17/2/22.
 */

@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + " !";
    }
}
