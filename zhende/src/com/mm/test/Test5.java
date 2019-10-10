package com.mm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Test5 {
public static void main(String[] args) throws IOException {
	String property = System.getProperty("user.dir");
	System.out.println(property);
	char s = File.separatorChar;
	String xin=property.substring(0, 1).replace("C", "D")+property.substring(1, property.length());
	System.out.println(xin);
	File src=new File(xin+s+"dest"+s+"nest"+"1.txt");
    boolean createNewFile = src.createNewFile();
	
	File in=new File("D://1.txt");
	InputStream is=null;
	OutputStream os=null;
	try {
	is=new FileInputStream(in);
	os=new FileOutputStream(src);
	
	byte[] ceach=new byte[1024];
	int len =-1;
	 while ((len=is.read(ceach))!=-1) {
		os.write(ceach,0,len);
		
	}
	 os.flush();

	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(is!=null) {
			is.close();
		}
		if(os!=null) {
			os.close();
		}
	}
}
}
