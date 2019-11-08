package com.woniu.c_springTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith就是告诉spring框架，由框架来帮我们生成spring IOC容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "applicationContext.xml")
public class SpringTest {
	@Autowired
	private Foo foo;
	@Test
	public void test1(){
		System.out.println(foo);//Foo [id=1, name=扫地僧]
	}
	
}
