package ex2;
import java.io.*;
/*public class Xiti_11 {
public static void main(String[] args)throws java.io.IOException{
	System.out.print("������һ���ַ�:");
	char a;
	a=(char)System.in.read();
	if (a=='a'||a=='A'){
		System.out.println("OK!");
	}
	else
	{
		System.out.println("δ�����ڴ�������!");
	}
}
}
*/
public class Xiti_11{
	public static void main(String[] args)throws IOException{
		int a;
		System.out.print("��������ĳɼ�:");
		a=System.in.read();
		if(a>=6){
			System.out.print("��ϲ�㣬�ɼ�����!");
		}
		else{
			System.out.print("���ź����ɼ�������!");
		}
	}
}
