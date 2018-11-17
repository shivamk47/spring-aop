package com.shivam.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.shivam.springaop.service.ShapeService.getCircle())")
    public void LoggingAdvice(){
        System.out.println("LoggingAdvice run!!!");
    }
}
