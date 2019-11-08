package com.woniu.d_javaConfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
	
	@Test
	public void test1() {//javaConfig写法代替xml中的<bean/>
		ApplicationContext act = //
				new AnnotationConfigApplicationContext(JavaConfig.class);
		Foo f1 = (Foo) act.getBean("f1");
		Foo f2 = (Foo) act.getBean("f1");
		System.out.println(f1);//Foo [id=1, name=扫地僧]
		System.out.println(f2);//Foo [id=1, name=扫地僧]
		System.out.println(f1 == f2);//false
	}
	
	
	@Test
	public void test2() {//依赖注入
		ApplicationContext act = //
				new AnnotationConfigApplicationContext(JavaConfig.class);
		Foo f = (Foo) act.getBean("f2");
		System.out.println(f);//Foo [id=1, name=扫地僧]
		System.out.println(f.getCar());//Car [brand=扫把, color=灰色]
	}
	
	@Test
	public void test3() {//自动装配
		ApplicationContext act = //        
				new AnnotationConfigApplicationContext(JavaConfig.class);
		Foo f = (Foo) act.getBean("f3");
		System.out.println(f);//Foo [id=2, name=邋遢鬼]
		System.out.println(f.getCar());//Car [brand=奥拓, color=红色]
	}
}
