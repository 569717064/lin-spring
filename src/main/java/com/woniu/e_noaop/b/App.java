package com.woniu.e_noaop.b;

public class App {
	public static void main(String[] args) {
		ICalc c = new CalcImpl();
		c.add(1, 2);
		c.sub(1, 2);
		c.mvl(1, 2);
		c.div(1, 2);
	}
}
