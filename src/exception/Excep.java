package exception;

import java.io.File;
import java.io.FileInputStream;

public class Excep {
public static int prt(){
	File f= new File("d:/LOL.exe");
	try{
		new FileInputStream(f);
		return 1;
	}catch(Exception e){
		System.out.println("这是异常栈跟踪消息：");
		e.printStackTrace();
		return 2;
	}finally{
		return 3;
	}
}
public static void main(String []args){
	int i = 1;
	int j = ++i + i++ + ++i + ++i + i++;
	System.out.println(j);
	System.out.println(prt());
}
}
