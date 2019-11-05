package array;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

public class File {
public static void main(String []args)throws Exception{
	/*java.io.File file = new java.io.File("C:\\Users\\junjie\\Desktop\\新建文本文档.txt");
	Scanner scan =  new Scanner(file); 
	System.out.print(scan.nextLine());*/
	String str1 = new String();
	try(FileInputStream abc = new FileInputStream("C:\\Users\\junjie\\Desktop\\新建文本文档.txt")){
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
//在java中readLine不会引发EOFException异常 !
//java中使用异常类ExceptionType("ExceptionStatement")创建异常对象，只有当异常不被捕获时才会引发java虚拟机输出ExceptionStatement.

