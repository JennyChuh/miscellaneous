package charactor;

public class Hero {
public String name = Hero.getname("��������");
public Hero(){
	 name = Hero.getname("���췽��");
}
{
	name = Hero.getname("��ʼ����");
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
һ��
�������Եĳ�ʼ�������ַ�ʽ
����ѳ�ʼ���飬���ڹ��췽�����棬���⣺
�����ַ�ʽ��˭��ִ�У�˭��ִ�У�
��������˳��ִ��
��������
��ʼ����
���췽��  java��ִ��
����
����ģʽ��Ԫ��
1. ���췽��˽�л�
2. ��̬����ָ��ʵ��
3. public static�� getInstance���������صڶ����ľ�̬����
*/
