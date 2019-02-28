package com.amazonaws.lambda.demo;

import java.time.LocalDateTime;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldLambdaHanlder implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        LocalDateTime date = LocalDateTime.now();

        return "Hello from Lambda! '"+ input + "' Current Time is '"+date+"'";
    }

}
