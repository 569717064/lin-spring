package com.woniu.e_noaop.b;

import java.util.Arrays;


public class CalcImpl implements ICalc {

	private void begin (String methodName,Object... objs) {
		System.out.println(methodName+"方法开始，参数是"+Arrays.toString(objs));
	}
	
	private void end(String methodName,Object r) {
		System.out.println(methodName+"method end,result is:"+r);
	}
	@Override
	public int add(int a, int b) {
		begin("add", a,b);
		int r = a + b;
		System.out.println("CalcImpl.add()");
		end("add", r);
		return r;
	}

	@Override
	public int sub(int a, int b) {
		begin("sub", a,b);
		int r = a - b;
		System.out.println("CalcImpl.sub()");
		end("sub", r);
		return r;
	}

	@Override
	public int mvl(int a, int b) {
		begin("mvl", a,b);
		int r = a * b;
		System.out.println("CalcImpl.mvl()");
		end("mvl", r);
		return r;
	}

	@Override
	public int div(int a, int b) {
		begin("div", a,b);
		int r = a / b;
		System.out.println("CalcImpl.div()");
		end("div", r);
		return r;
	}

}
