package genetic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist1{
public static void main(String []args){
	List<String> list1 = new ArrayList<>();
	list1.add("zhangsan");
	Scanner scan = new Scanner(System.in);
	String str1;
	do{
		str1 = scan.nextLine();
		list1.add(str1);
	}while(!str1.equals(""));
	Arraylist1.<List<String>>print(list1);
	System.out.println(list1);
}
/*static class  auto {*/
	public static  <E> void print(E x){
		System.out.println(x);
}
}
//}
/*�Ǿ�̬�ڲ��಻�ܰ�����̬����;
1.static���͵����Ժͷ�����������ص�ʱ��ͻ�������ڴ��С�
2.Ҫ��ʹ��ĳ�����static���Ժͷ�������ô��������Ҫ���ص�������С�
3.�Ǿ�̬�ڲ��ಢ�����ⲿ��һ����أ�ֻ����ʵ�����ⲿ��֮��Ż���ء�
���ڿ��������������ⲿ�ಢû��ʵ�������ڲ��໹û�м��أ���ʱ����������ڲ���ľ�̬��Ա�򷽷���
�ڲ��໹û�м��أ�ȴ��ͼ���ڴ��д������ڲ���ľ�̬��Ա����������ì�ܵġ�
���ԷǾ�̬�ڲ��಻���о�̬��Ա������̬������*/
