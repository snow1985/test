package com.mm.test;

public class Test1 {
  
	public static void main(String[] args) {
		
		System.out.println(fun(6));
	}
	private static int fun(int yun) {
		if(yun==1||yun==2) {
			return 1;
		}else {
			return fun(yun-1)+fun(yun-2);
		}
	}
}
