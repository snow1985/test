package Testw1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Resive implements Runnable{
    private DatagramSocket ds;
    private DatagramPacket dp;
    private int sport;
    private Boolean condition=true;
    private String name;
    public Resive(int sport,String name) {
    	this.sport=sport;
    	this.name=name;
    	try {
			ds=new DatagramSocket(sport);
		} catch (SocketException e) {
			
			e.printStackTrace();
		}
	}
    
	@Override
	public void run() {
		
		try {
			while (condition) {
			byte[] bt=new byte[1024*50];
			dp=new DatagramPacket(bt, bt.length, new InetSocketAddress(sport));
			ds.receive(dp);
			byte[] data = dp.getData();
			String str=new String(data, 0, data.length);
			
			System.out.println(str+this.name);
			if(str.equals("exit")) {
				ds.close();
				condition=false;
			}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
