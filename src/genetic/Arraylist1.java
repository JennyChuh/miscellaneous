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
/*非静态内部类不能包含静态方法;
1.static类型的属性和方法，在类加载的时候就会存在于内存中。
2.要想使用某个类的static属性和方法，那么这个类必须要加载到虚拟机中。
3.非静态内部类并不随外部类一起加载，只有在实例化外部类之后才会加载。
现在考虑这个情况：在外部类并没有实例化，内部类还没有加载，这时候如果调用内部类的静态成员或方法，
内部类还没有加载，却试图在内存中创建该内部类的静态成员，这明显是矛盾的。
所以非静态内部类不能有静态成员变量或静态方法。*/
