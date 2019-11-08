package com.woniu.e_aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	@Test
	public void test() throws Exception{
		ApplicationContext act = //
				new ClassPathXmlApplicationContext("com/woniu/e_aop/applicationContext.xml");
	ICalc c = (ICalc) act.getBean("calcImpl");
	c.add(1, 2);
	System.out.println(c.getClass());
	}
}
