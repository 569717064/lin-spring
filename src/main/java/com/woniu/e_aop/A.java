package com.woniu.e_aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class A {//切面类

	@Before("execution(* com.woniu.e_aop.*.*(..))")
	public void f1() {
		System.out.println("前置通知：A.f1()");
	}
	
	@After("execution(* com.woniu.e_aop.*.*(..))")
	public void f2() {
		System.out.println("后置通知：A.f2()");
	}
}
