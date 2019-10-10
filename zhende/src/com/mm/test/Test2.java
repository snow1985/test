package com.mm.test;

import java.math.BigDecimal;
import java.time.format.DecimalStyle;

/**
 * @author mzybobo
 *利用 BigDecimal 计算提层
 */
public class Test2 {
	private static final Double LEVEL1=100000.0;
	private static final Double LEVEL2=200000.0;
	private static final Double LEVEL3=300000.0;
	private static final Double LEVEL4=400000.0;
	private static final Double LEVEL5=500000.0;
	private static BigDecimal num1=new BigDecimal("0.1");
	private static BigDecimal num2=new BigDecimal("0.075");
	private static BigDecimal num3=new BigDecimal("0.05");
	private static BigDecimal num4=new BigDecimal("0.03");
	private static BigDecimal num5=new BigDecimal("0.01");
	Double d=400000.0;
		public static void main(String[] args) {
			Test2 test2=new Test2();
			System.out.println(test2.jisuan());
		 
			
		}
		
		public  BigDecimal jisuan() {
			BigDecimal result=BigDecimal.ZERO;
			 if(d<=LEVEL1&&d>0) {
				  result=(new BigDecimal(d.toString())).multiply(num1); 			   
	 		  }else if (d>LEVEL1&&d<=LEVEL2) {
	 			  result=(new BigDecimal(d.toString())).multiply(num2);
			}else if (d>LEVEL2&&d<=LEVEL3) {
				 result=(new BigDecimal(d.toString())).multiply(num3);
			}else if (d>LEVEL3&&d<=LEVEL4) {
				 result=(new BigDecimal(d.toString())).multiply(num4);
			}else if (d>LEVEL4&&d<=LEVEL5){
				 result=(new BigDecimal(d.toString())).multiply(num5);
			}
			 return result;
		}
		
}


