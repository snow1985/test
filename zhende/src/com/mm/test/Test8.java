package com.mm.test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

public class Test8 {
public static void main(String[] args) throws IOException, URISyntaxException {
	String string = IOUtils.toString(new URI("http://www.baidu.com"),"utf-8");
			File file=new File("2.txt");
			FileUtils.write(file, string, "utf-8", true);
			URL url=new URL("http://www.baidu.com");
			String string2 = url.toString();
			System.out.println(string2);
			
}
}
