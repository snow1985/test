package Sheji;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.security.interfaces.RSAKey;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import javax.xml.stream.events.Characters;

public class Proces {
public static void main(String[] args) {
	InputStream is=null;
	
	
	File file=new File("D:\\xx\\TestString.java");

	try {
		StringBuffer sb=new StringBuffer();
		is=new FileInputStream(file);
		byte[] data=new byte[1024];
		int len=-1;
		
		while((len=is.read(data))!=-1) {
		    is.read(data,0,len);
		    String s=new String(data, 0, len);
		    sb.append(s);
		}
		
		 
		
		System.out.println(sb.substring(14));
		JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
		int run = compiler.run(null, null, null, sb.substring(14));
		System.out.println(run==0?"编译成功":"编译失败");
	} catch (Exception e) {
		
		e.printStackTrace();
	}finally {
		if (is!=null) {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
}
