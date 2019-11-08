package com.woniu.b_springLife;

import java.io.Serializable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Foo implements Serializable,BeanNameAware,BeanFactoryAware,ApplicationContextAware
	,InitializingBean,DisposableBean{
	private Integer id;
	private String name;
	public Foo(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Foo() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Foo [id=" + id + ", name=" + name + "]";
	}
	
	public void fooInit() {
		System.out.println("Foo.fooInit()");
	}
	public void fooDestory() {
		System.out.println("Foo.fooDestory");
	}
	@Override
	public void setBeanName(String name) {
		System.out.println("Foo.setBeanName():"+name);
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Foo.setBeanFactory():"+beanFactory);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Foo.setApplicationContext():"+applicationContext);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Foo.afterPropertiesSet():");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Foo.destroy()");
	}
	
}
