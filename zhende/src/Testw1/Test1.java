package Testw1;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Test1 {
    public static void main(String[] args) throws IOException {
		System.out.println("服务端启动中");
		DatagramSocket ds=new DatagramSocket(9999);
		byte[] bt=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bt, 0, bt.length);
		
		
		ds.receive(dp);
		byte[] resive=dp.getData();
		ByteArrayInputStream in=new ByteArrayInputStream(resive);
		DataInputStream dis=new DataInputStream(new BufferedInputStream(in));
		String str=dis.readUTF();
		int ins=dis.readInt();
		boolean d=dis.readBoolean();
		
		System.out.println(str);
		System.out.println(ins);
		System.out.println(d);
		
		
	}
}
