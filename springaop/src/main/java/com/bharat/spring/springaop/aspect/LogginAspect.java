package com.bharat.spring.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("")
	public void logBefore(JoinPoint joinpoint) {
		System.out.println("Before Calling the method");
	}
	
	@After("")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After the method execution");
	}
}
