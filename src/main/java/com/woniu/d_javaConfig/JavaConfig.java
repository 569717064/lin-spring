package com.woniu.d_javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//只要在一个类上面加上了@Configuration注解，
//那么该类就不是一个普通类，而是一个“配置文件”
@Configuration
public class JavaConfig {
	
	/**
	 * <bean id="f1" class="com.woniu.d_javaConfig.Foo.java">
	 * 		<property name="id" value="1"/>
	 * 		<property name="name" value="扫地僧"/>
	 * </bean>
	 */
	@Bean
	@Scope("prototype")
	public Foo f1() {
		Foo f = new Foo();
		f.setId(1);
		f.setName("扫地僧");
		return f;
	}
	//==============================================================================
	
	/**<bean id="c" class="com.woniu.d_javaConfig.Car.java">
	 * 		<property name="brand" value="扫把"/>
	 * 		<property name="color" value="灰色"/>
	 * </bean>
	 * <bean id="f2" class="com.woniu.d_javaConfig.Foo.java">
	 * 		<property name="id" value="1"/>
	 * 		<property name="name" value="扫地僧"/>
	 * 		<property name="car" ref="c"/>
	 * </bean>
	 */
	@Bean
	public Car c() {
		Car c = new Car();
		c.setBrand("扫把");
		c.setColor("灰色");
		return c;
	}
	@Bean
	public Foo f2() {
		Foo f = new Foo();
		f.setId(1);
		f.setName("扫地僧");
		f.setCar(c());
		return f;
	}
	
	//======================================================================================
	/**<bean id="c2" class="com.woniu.d_javaConfig.Car.java">
	 * 		<property name="brand" value="奥拓"/>
	 * 		<property name="color" value="红色"/>
	 * </bean>
	 * <bean id="f3" class="com.woniu.d_javaConfig.Foo.java" autowire="byType">
	 * 		<property name="id" value="2"/>
	 * 		<property name="name" value="邋遢鬼"/>
	 * </bean>
	 */
	@Bean
	public Car c2() {
		Car c = new Car();
		c.setBrand("奥拓");
		c.setColor("红色");
		return c;
	}
	@Bean
	public Foo f3(Car c2) {
		Foo f = new Foo();
		f.setId(2);
		f.setName("邋遢鬼");
		f.setCar(c2);
		return f;
	}
}
