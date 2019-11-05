package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client_1 {
	public static void main(String []args)throws UnknownHostException{
		InetAddress host = InetAddress.getLocalHost();
		//String ip =host.getHostAddress();
        //System.out.println("本机ip地址：" + ip);
		System.out.print(host);
	}
}
class generalclass{
	public static void main(String []args)throws UnknownHostException{
		InetAddress host = InetAddress.getLocalHost();
		//String ip =host.getHostAddress();
        //System.out.println("本机ip地址：" + ip);
		System.out.print(host);
	}
}