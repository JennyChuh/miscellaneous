package charactor;

public class Hero {
public String name = Hero.getname("属性声明");
public Hero(){
	 name = Hero.getname("构造方法");
}
{
	name = Hero.getname("初始化块");
}
public static String getname(String pos){
	String result = pos;
	System.out.print(result+"\n");
	return result;
}
public static void main(String [] Args){
	new Hero();
}
}
/*
一、
对象属性的初始化有三种方式
故意把初始化块，放在构造方法下面，问题：
这三种方式，谁先执行？谁后执行？
按照以下顺序执行
属性声明
初始化块
构造方法  java在执行
二、
单例模式三元素
1. 构造方法私有化
2. 静态属性指向实例
3. public static的 getInstance方法，返回第二步的静态属性
*/
