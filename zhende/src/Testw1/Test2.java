package Testw1;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		System.out.println("客户端启动中");
		DatagramSocket ds=new DatagramSocket(8900);
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(bao));
		dos.writeUTF("++++");
		dos.writeInt(18);
		dos.writeBoolean(true);
		
		dos.flush();
		byte[] bt=bao.toByteArray();
		DatagramPacket dp=new DatagramPacket(bt, 0,bt.length, new InetSocketAddress("localhost",9999));
		ds.send(dp);
		ds.close();
	}
   
}
