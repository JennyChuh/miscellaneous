package learning_java;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestSocket {
public static void main(String []args)throws UnknownHostException{
	InetAddress hostA = InetAddress.getLocalHost();
	String ip = hostA.getHostAddress();
	System.out.println(ip);
}
}
