package com.scujcc.highlight_spring4.ch1.javaconfig;

/**
 * Created by David on 17/2/26.
 */
public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }

}
