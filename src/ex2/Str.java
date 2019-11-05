package ex2;
import java.util.Scanner;
public class Str {
public static void main(String [] args){
	char c = 'a';
	Scanner input = new Scanner(System.in);
	String a;
	a = input.nextLine();
	a = input.next();
	System.currentTimeMillis();
	System.out.printf("%s%n",a);
	System.out.println("字符相关方法:");
	System.out.println("isDigit()返回结果是"+Character.isDigit(c));
	System.out.println("isLetter()返回结果是"+Character.isLetter(c));
	System.out.println("isLetterOrDigit()返回结果是"+Character.isLetterOrDigit(c));
	System.out.println("isLowerCase()返回结果是"+Character.isLowerCase(c));
	System.out.println("isUpperCase()返回结果是"+Character.isUpperCase(c));
	System.out.println("isDigit()返回结果是"+Character.isDigit(c));
	System.out.println("toUpperCase()返回结果是"+Character.toUpperCase(c));
	System.out.println("toLowerCase()返回结果是"+Character.toLowerCase(c));
	System.out.println("字符串相关方法:");
	String str = " chain ";
	String str1 = "ChaiN";
	String str2 = "network";
	System.out.println("toUpperCase()返回结果是"+str.toUpperCase());
	System.out.println("str1.length()返回结果是"+str1.length());
	System.out.println("toLowerCase()返回结果是"+str.toLowerCase());
	System.out.println("charAt(0)返回结果是"+str.charAt(0));
	System.out.println("concat(str2)返回结果是"+str.concat(str2));
	System.out.println("trim()返回结果是"+str.trim());
	System.out.println("equals(str2)返回结果是"+str.equals(str2));
	System.out.println("equalsIgnoreCase返回结果是"+str.equalsIgnoreCase(str1));
	System.out.println("compareTo返回结果是"+str.compareTo(str1));
	System.out.println("compareToIgnoreCase返回结果是"+str.compareTo(str1));
	System.out.println("endWith返回结果是"+str.endsWith(" "));
	System.out.println("startsWith返回结果是"+str.startsWith(" "));
	System.out.println("contains返回结果是"+str.contains(" "));
	System.out.println("字符串获取子串及字符相关方法:");
	System.out.println("substring()返回结果是"+str.substring(2));
	System.out.println("substring()返回结果是"+str.substring(2,4));
	System.out.println("indexOf(ch)返回结果是"+str.indexOf('c'));//返回第一次出现的位置
	System.out.println("indexOf(ch,fromindex)返回结果是"+str.indexOf('c',0));//返回第一次出现的位置
	System.out.println("indexOf(s)返回结果是"+str.indexOf("ha"));//返回第一次出现的位置
	System.out.println("indexOf(s,fromindex)返回结果是"+str.indexOf("ha",0));//返回第一次出现的位置
	System.out.println("lastIndexOf(ch)返回结果是"+str.lastIndexOf('c'));//返回最后一次出现的位置
	System.out.println("lastIndexOf(ch,fromindex)返回结果是"+str.lastIndexOf('c',0));//返回最后一次出现的位置
	System.out.println("lastIndexOf(s)返回结果是"+str.lastIndexOf("ha"));//返回最后一次出现的位置
	System.out.println("lastIndexOf(s,fromindex)返回结果是"+str.lastIndexOf("ha",0));//返回最后一次出现的位置
}
}
//如果没有匹配的输出 -1 如果有则返回位置
