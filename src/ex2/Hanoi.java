package ex2;

public class Hanoi {
static void hanoi(char A,char B,char C,int n){
	if(n==1)
	{
		System.out.println(A+"����>"+C);
	}
	else
	{
		hanoi(A,C,B,n-1);
		System.out.println(A+"����>"+C);
		hanoi(B,A,C,n-1);
	}
}
public static void main(String args[]){
	hanoi('A','B','C',3);
}
}
/*
 * �ݹ��˼�룬��취�ѵݹ���ʽ����ѧ������������
 * Ȼ���ñ�����Ա�ʾ��ѧ����
 * �ͱ����ں�ŵ�������У�
 * ���԰�����ֽ���������裬��һ�������ǰ�A�����ϵ���ײ���������������n-1�����ӽ���һ������C�Ƶ���һ������B
 * �ڶ����ǰ�B�����ϵ�n-1�����ӽ���A�����Ƶ�C������
 * Ȼ���ñ������ֱ����������
 * Ȼ��һ��OK!
 */
