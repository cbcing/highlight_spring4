package com.scujcc.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by David on 17/2/22.
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }

}
