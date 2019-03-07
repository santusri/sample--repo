package com.amazonaws.lambda.demo;

import java.time.LocalDateTime;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldLambdaHanlder implements RequestHandler<Request, String> {

    @Override
    public String handleRequest(Request input, Context context) {
        context.getLogger().log("Input: " + input.getInput());
        LocalDateTime date = LocalDateTime.now();

        return "Hello from Lambda! '"+ input.getInput() + "' Current Time is '"+date+"'";
    }

}
