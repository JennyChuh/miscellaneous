package array;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

public class File {
public static void main(String []args)throws Exception{
	/*java.io.File file = new java.io.File("C:\\Users\\junjie\\Desktop\\�½��ı��ĵ�.txt");
	Scanner scan =  new Scanner(file); 
	System.out.print(scan.nextLine());*/
	String str1 = new String();
	try(FileInputStream abc = new FileInputStream("C:\\Users\\junjie\\Desktop\\�½��ı��ĵ�.txt")){
	try{
	DataInputStream cd = new DataInputStream(abc);
	while(true){
	str1 = cd.readLine();
	if(str1 == null){
		EOFException x = new EOFException("EOFException !");
		throw  x;
	}
	System.out.println(str1);
	}
	}
	catch (EOFException x){
		System.out.println("this is end of the file !");
	}
	finally{
		System.out.print("the end !");
	}
}
}
}
//��java��readLine��������EOFException�쳣 !
//java��ʹ���쳣��ExceptionType("ExceptionStatement")�����쳣����ֻ�е��쳣��������ʱ�Ż�����java��������ExceptionStatement.

