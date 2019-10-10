package com.mm.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test6 {
  public static void main(String[] args) throws IOException {
	  PrintStream ps=null;
	FileOutputStream fo=new FileOutputStream(new File("D:\\2.txt"));
	ps=new PrintStream(fo);
	if(fo!=null) {
		System.setOut(ps);
	}
	int len=0;
	for(char c=0;c<60000;c++) {
		System.out.print(c+"");
		len++;
		if(len>=100) {System.out.println();len=0;}
	}
	fo.close();
	
}
}
