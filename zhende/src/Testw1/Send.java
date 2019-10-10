package Testw1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Send implements Runnable{
    private DatagramSocket ds;
    private DatagramPacket dp;
    private int sport;
    private int port;
    private Boolean condition=true;
    public Send(int port, int sport) {
		super();
		this.sport = sport;
		this.port = port;
		try {
			ds=new DatagramSocket(port);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		
		
			
			
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while (condition) {
		try {
			String str=br.readLine();
			
			byte[] bytes = str.getBytes();
			dp=new DatagramPacket(bytes,0, bytes.length, new InetSocketAddress("localhost", this.sport));
			ds.send(dp);
			if(str.equals("exit")) {
				ds.close();
				condition=false;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
	}
	

}
