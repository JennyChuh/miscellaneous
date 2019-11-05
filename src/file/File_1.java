package file;
import java.io.File;
import java.io.PrintWriter;
public class File_1 {
public static void main(String []args)throws Exception{
	File  f1 = new File("d:\\1.txt");
	if(f1.exists()){
		System.out.println("the file have already exsits!");
		System.out.printf("the size of this file is: %d",f1.length());
	}else{
		try(PrintWriter p1 = new PrintWriter(f1)){
			p1.print("уехЩ");
			System.out.print("write successfully!");
			System.out.printf("the size of this file is: %d",f1.length());
		}
	}
}
}
