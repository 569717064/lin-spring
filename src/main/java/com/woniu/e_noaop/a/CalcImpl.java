package com.woniu.e_noaop.a;

/**
 * 需求改变，要加入日志、校验等，每个方法都需要改变，
 * 维护比较困难
 *
 */
public class CalcImpl implements ICalc {

	@Override
	public int add(int a, int b) {
		System.out.println("add 方法开始，参数是："+a+","+b);
		int r = a + b;
		System.out.println("CalcImpl.add()");
		System.out.println("add 方法结束，返回值是："+r);
		return r;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("sub 方法开始，参数是："+a+","+b);
		int r = a - b;
		System.out.println("CalcImpl.sub()");
		System.out.println("sub 方法结束，返回值是："+r);
		return r;
	}

	@Override
	public int mvl(int a, int b) {
		System.out.println("mvl method strat，args is："+a+","+b);
		int r = a * b;
		System.out.println("CalcImpl.mvl()");
		System.out.println("mvl method end，result is："+r);
		return r;
	}

	@Override
	public int div(int a, int b) {
		System.out.println("div method strat，args is："+a+","+b);
		int r = a / b;
		System.out.println("CalcImpl.div()");
		System.out.println("div method end，result is："+r);
		return r;
	}

}
