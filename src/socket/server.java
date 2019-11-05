package socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

		public static void main(String []args){
			try {
				ServerSocket ss = new ServerSocket(8080);
				System.out.println("正在监听8080端口");
				Socket s = ss.accept();
				System.out.println("有连接过来"+s);
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				int mesg;
				int outMesg;
				mesg = is.read();
				System.out.println("服务器收到消息"+mesg);
				System.out.println("现在服务端发言:");
				Scanner input = new Scanner(System.in);
				outMesg = input.nextInt();
				dos.write(outMesg);
				is.close();
				System.out.println("连接正在关闭...");
				s.close();
				ss.close();
				System.out.println("连接已关闭");
			}catch(IOException e){
				e.printStackTrace();
			}
		}
}
