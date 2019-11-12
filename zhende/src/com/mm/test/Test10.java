package com.mm.test;

import java.util.concurrent.TimeUnit;

public class Test10 {
	synchronized void test(){
		System.out.println("test start........");
		try {
		TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		System.out.println("test end........");
		}
		public static void main(String[] args) {
		new Test100().test();
		}
		}

		class Test100 extends Test10{
		@Override
		synchronized void test() {
		System.out.println("child test start.......");
		super.test();
		System.out.println("child test end.......");
		}
}
