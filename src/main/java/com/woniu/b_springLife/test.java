package com.woniu.b_springLife;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	@Test
	public void test1() throws Exception {
		ApplicationContext act = //
				new ClassPathXmlApplicationContext("com/woniu/b_springLife/applicationContext.xml");
		Foo fo = (Foo)act.getBean("f");
		Bar b = (Bar)act.getBean("b");
		System.out.println("-------------此时bean已经进入到spring容器中-------------------");
		System.out.println("id="+fo.getId()+" : name="+fo.getName());
		System.out.println("id="+b.getId()+" : name="+b.getName());
		((AbstractApplicationContext) act).close();
	}
}
