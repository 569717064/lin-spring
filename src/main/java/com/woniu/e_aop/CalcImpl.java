package com.woniu.e_aop;

import org.springframework.stereotype.Component;

@Component
public class CalcImpl implements ICalc {

	@Override
	public int add(int a, int b) {
		int r = a + b;
		System.out.println("CalcImpl.add()");
		return r;
	}

	@Override
	public int sub(int a, int b) {
		int r = a - b;
		System.out.println("CalcImpl.sub()");
		return r;
	}

	@Override
	public int mvl(int a, int b) {
		int r = a * b;
		System.out.println("CalcImpl.mvl()");
		return r;
	}

	@Override
	public int div(int a, int b) {
		int r = a / b;
		System.out.println("CalcImpl.div()");
		return r;
	}

}
