package com.mm.test;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.zip.DataFormatException;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class Test4 {
public static void main(String[] args) throws ParseException {
	String str="2010-10-10";
	DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
	Date date=df.parse(str);
	
	Calendar cl=new GregorianCalendar();
	cl.setTime(date);
	char s = File.separatorChar;
	String path="d:"+s+"tt";
	File file =new File(path);
	
	int day=cl.get(Calendar.DAY_OF_MONTH);
	System.out.println(df.format(date));
	
	System.out.println("一\t二\t三\t四\t五\t六\t七");
	cl.set(Calendar.DAY_OF_MONTH, 1);
	for (int i = 0; i < cl.get(Calendar.DAY_OF_WEEK)-1; i++) {
		System.out.print("\t");
	}
	for (int i = 1; i <= cl.getActualMaximum(Calendar.DATE); i++) {
		
	if(i==day) {
		System.out.print("*");
	}
		System.out.print(i+"\t");
		if(cl.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
			System.out.println("\n");
			
		}
		cl.add(Calendar.DAY_OF_MONTH, 1);
		
	}
   
	
    
}
}
