package com.woniu.a_spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	@Test
	public void test1() throws Exception {
		ApplicationContext act = new ClassPathXmlApplicationContext("com/woniu/a_spring/applicationContext.xml");
		
		//无参构造器
		DeptDAO dd = (DeptDAO)act.getBean("dd");
		DeptDAO dd2 = (DeptDAO)act.getBean("dd");
		dd.list();
		dd2.list();
		System.out.println(dd == dd2);
		
		//静态工厂
//		DeptDAO dd = (DeptDAO)act.getBean("df1");
//		dd.list();
		
		//实例工厂
//		DeptDAO dd = (DeptDAO)act.getBean("df3");
//		dd.list();
		
		//set注入
//		DeptService ds = (DeptService)act.getBean("ds");
//		ds.list();
		
		//构造器注入
//		DeptService ds = (DeptService)act.getBean("ds2");
//		ds.list();
	}
}
