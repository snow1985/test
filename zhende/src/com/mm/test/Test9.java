package com.mm.test;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class Test9 {
public static void main(String[] args) throws URISyntaxException, IOException {
	String str="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.132 Safari/537.36";
	URI url=new URI("http://www.baidu.com/");
	String string = IOUtils.toString(url,"utf-8");
	FileUtils.write(new File("3.txt"), string, "utf-8", true);
	System.out.println(System.getProperty("user.dir"));
		
}
}
