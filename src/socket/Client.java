package socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	public static void main(String [] args){
		try {
			Socket s = new Socket("127.0.0.1",8080);
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStream is = s.getInputStream();
			int outMesg;
			int mesg;
			System.out.println("现在客户端发言:");
			Scanner input = new Scanner(System.in);
			outMesg = input.nextInt();
			System.out.println("正在发送请求");
			dos.write(outMesg);
			mesg = is.read();
			System.out.println("客户端收到消息"+mesg);
			s.close();
			System.out.println("正在关闭连接...");
			dos.close();
			System.out.println("连接已关闭");
		}catch(UnknownHostException e ){
			e.printStackTrace();
		}catch(IOException e ){
			e.printStackTrace();
		}
	}
}