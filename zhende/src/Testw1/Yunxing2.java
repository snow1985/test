package Testw1;

public class Yunxing2 {
public static void main(String[] args) {
	Send send = new Send(9875, 9999);
	Resive resive = new Resive(8888,"2");
	new Thread(send).start();
	new Thread(resive).start();
}
}
