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
				System.out.println("���ڼ���8080�˿�");
				Socket s = ss.accept();
				System.out.println("�����ӹ���"+s);
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				int mesg;
				int outMesg;
				mesg = is.read();
				System.out.println("�������յ���Ϣ"+mesg);
				System.out.println("���ڷ���˷���:");
				Scanner input = new Scanner(System.in);
				outMesg = input.nextInt();
				dos.write(outMesg);
				is.close();
				System.out.println("�������ڹر�...");
				s.close();
				ss.close();
				System.out.println("�����ѹر�");
			}catch(IOException e){
				e.printStackTrace();
			}
		}
}
