package ex2;
import java.io.*;
/*public class Xiti_11 {
public static void main(String[] args)throws java.io.IOException{
	System.out.print("请输入一个字符:");
	char a;
	a=(char)System.in.read();
	if (a=='a'||a=='A'){
		System.out.println("OK!");
	}
	else
	{
		System.out.println("未输入期待的数据!");
	}
}
}
*/
public class Xiti_11{
	public static void main(String[] args)throws IOException{
		int a;
		System.out.print("请输入你的成绩:");
		a=System.in.read();
		if(a>=6){
			System.out.print("恭喜你，成绩及格!");
		}
		else{
			System.out.print("很遗憾，成绩不及格!");
		}
	}
}
