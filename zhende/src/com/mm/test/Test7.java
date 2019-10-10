package com.mm.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test7 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		  T t=new T();
		  t.a=1;
		  FileOutputStream fo=new FileOutputStream("D:/3.txt");
		  ObjectOutputStream oos=new ObjectOutputStream(fo);
		  oos.writeObject(t);
		  oos.flush();
		  oos.close();
		  FileInputStream fi=new FileInputStream("D:/3.txt");
		  ObjectInputStream ois=new ObjectInputStream(fi);
		  T r = (T)ois.readObject();
		  System.out.println(r.a+"-"+r.b+"-");
	}

}
class T implements Serializable{
	int a=10;
	int b=9;
	int c=8;
	int d=7;
}