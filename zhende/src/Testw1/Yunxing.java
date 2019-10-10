package Testw1;

public class Yunxing {
public static void main(String[] args) {
	Send send = new Send(9788, 8888);
	Resive resive = new Resive(9999,"1");
	new Thread(send).start();
	new Thread(resive).start();
}
}
