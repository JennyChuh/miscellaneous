package ex2;
//import java.io.*;
public class Ex2_8 {
public static void main(String[] args)throws java.io.IOException{
   char y;
   System.out.println("请输入一个'0'~'9'之间的数字:");
   y=(char)System.in.read();
   int x=y-48;
   System.out.print("对应的数值为:"+x);
}
}