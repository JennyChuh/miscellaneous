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
	System.out.println("�ַ���ط���:");
	System.out.println("isDigit()���ؽ����"+Character.isDigit(c));
	System.out.println("isLetter()���ؽ����"+Character.isLetter(c));
	System.out.println("isLetterOrDigit()���ؽ����"+Character.isLetterOrDigit(c));
	System.out.println("isLowerCase()���ؽ����"+Character.isLowerCase(c));
	System.out.println("isUpperCase()���ؽ����"+Character.isUpperCase(c));
	System.out.println("isDigit()���ؽ����"+Character.isDigit(c));
	System.out.println("toUpperCase()���ؽ����"+Character.toUpperCase(c));
	System.out.println("toLowerCase()���ؽ����"+Character.toLowerCase(c));
	System.out.println("�ַ�����ط���:");
	String str = " chain ";
	String str1 = "ChaiN";
	String str2 = "network";
	System.out.println("toUpperCase()���ؽ����"+str.toUpperCase());
	System.out.println("str1.length()���ؽ����"+str1.length());
	System.out.println("toLowerCase()���ؽ����"+str.toLowerCase());
	System.out.println("charAt(0)���ؽ����"+str.charAt(0));
	System.out.println("concat(str2)���ؽ����"+str.concat(str2));
	System.out.println("trim()���ؽ����"+str.trim());
	System.out.println("equals(str2)���ؽ����"+str.equals(str2));
	System.out.println("equalsIgnoreCase���ؽ����"+str.equalsIgnoreCase(str1));
	System.out.println("compareTo���ؽ����"+str.compareTo(str1));
	System.out.println("compareToIgnoreCase���ؽ����"+str.compareTo(str1));
	System.out.println("endWith���ؽ����"+str.endsWith(" "));
	System.out.println("startsWith���ؽ����"+str.startsWith(" "));
	System.out.println("contains���ؽ����"+str.contains(" "));
	System.out.println("�ַ�����ȡ�Ӵ����ַ���ط���:");
	System.out.println("substring()���ؽ����"+str.substring(2));
	System.out.println("substring()���ؽ����"+str.substring(2,4));
	System.out.println("indexOf(ch)���ؽ����"+str.indexOf('c'));//���ص�һ�γ��ֵ�λ��
	System.out.println("indexOf(ch,fromindex)���ؽ����"+str.indexOf('c',0));//���ص�һ�γ��ֵ�λ��
	System.out.println("indexOf(s)���ؽ����"+str.indexOf("ha"));//���ص�һ�γ��ֵ�λ��
	System.out.println("indexOf(s,fromindex)���ؽ����"+str.indexOf("ha",0));//���ص�һ�γ��ֵ�λ��
	System.out.println("lastIndexOf(ch)���ؽ����"+str.lastIndexOf('c'));//�������һ�γ��ֵ�λ��
	System.out.println("lastIndexOf(ch,fromindex)���ؽ����"+str.lastIndexOf('c',0));//�������һ�γ��ֵ�λ��
	System.out.println("lastIndexOf(s)���ؽ����"+str.lastIndexOf("ha"));//�������һ�γ��ֵ�λ��
	System.out.println("lastIndexOf(s,fromindex)���ؽ����"+str.lastIndexOf("ha",0));//�������һ�γ��ֵ�λ��
}
}
//���û��ƥ������ -1 ������򷵻�λ��
