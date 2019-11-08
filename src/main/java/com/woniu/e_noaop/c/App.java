package com.woniu.e_noaop.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


class MyHander implements InvocationHandler{

	private Object target;
	
	public MyHander(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Boolean flag = false;
		Object r = null;
		for (Object object : args) {
			if (object instanceof Integer) {
				if ((int)object > 0) {
					flag = true;
				}else {
					flag = false;
				}
			}
		}
		
		if (flag != false) {
			r = (int) method.invoke(target, args);
		}else {
			throw new RuntimeException("参数不可以小于0");
		}
		//这里的返回值会返回到代理对象调用方法的调用处
		return r;
	}

	
}

public class App {
	public static void main(String[] args) {
		//目标对象
		ICalc c = new CalcImpl();
		
		//创建代理对象时，需要三个参数
		/**
		 * 第一个参数，ClassLoader，表示类加载器
		 * 类加载器，顾名思义就是用来加载类的字节码的，我们已经知道，要创建一个对象，
		 * 必须调用类的构造器：new 构造器的名字()；
		 * 在构造器执行的时候，就会引起类的加载，加载类恰恰就是使用类加载器来完成的
		 * 下面也是在创建对象，但是没有使用构造器创建，而是使用动态代理创建对象，
		 * 动态代理创建对下的方式是一种不正常的创建对象的方式，尽管动态代理是一种不正常的
		 * 创建对象的方式，但他毕竟也是要创建对象，只要创建对象，就一定会先加载对象所属的类的
		 * 字节码，所以我们必须手动的把一个类加载器传入，一遍让动态代理能使用传入的类加载器来加载字节码
		 * 
		 * 我们已经知道，类的字节码是由原代码编译而来的，也就是先有源代码，编译源代码后，就得到字节码
		 * 所谓的动态代理，就是在jvm运行时，动态的在内存中直接生成字节码，而不需要源代码 
		 *  
		 *  这个直接在内存中生成的字节码，它的“原型”是什么，也就是到底依据什么线索生成的字节码呢？
		 *  这恰恰是有第二个参数决定的
		 */
		ClassLoader c1 = App.class.getClassLoader();
		/**
		 * 第二个参数是一个字节码数组，且该字节码数组中，必须都是接口的字节码
		 * 我们已经知道，动态代理会在内存中直接生成类的字节码，问题是，这个类的内容是什么？
		 * 这个类会去实现第二个参数中的所指定的所有接口，这就是类的内容
		 * 
		 * 本例中动态生成的字节码所属的类，就会实现ICalc接口，所以类也就会实现接口中的方法
		 * 问题是，这些方法的方法体内容又是什么？这恰恰是有第三个参数决定的
		 * 
		 */
		Class[] interfaces = c.getClass().getInterfaces();
		/*
		 * 第三个参数，名字叫做“调用处理器”
		 * 对代理对象任何方法调用,都不是调用真正的方法，而是进入InvocationHand的invoke方法中
		 * 
		 */
		InvocationHandler h = new MyHander(c);
		/**
		 * 1.代理对象和目标对象具有相同的接口
		 * 2.代理对象有权利控制能不能调用真实的方法
		 */
		ICalc proxy = (ICalc)Proxy.newProxyInstance(c1, interfaces, h);
		
		int x = proxy.add(1, 2);
		System.out.println("result:"+x);
	}
}
