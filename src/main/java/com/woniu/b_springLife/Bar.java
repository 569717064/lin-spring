package com.woniu.b_springLife;

import java.io.Serializable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Bar implements Serializable,BeanPostProcessor{
	private Integer id;
	private String name;
	public Bar(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Bar() {
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
		return "Bar [id=" + id + ", name=" + name + "]";
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bar.postProcessBeforeInitialization():"+bean+"*****"+beanName);
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bar.postProcessAfterInitialization():"+bean+"*****"+beanName);
		return bean;
	}
	
}
