package ex2;
/*
 * �ݹ麯���Ĺ���
 * 1.���ȹ����ݹ���ʽ
 * 2.���ݵݹ���ʽ��������
 */
public class Di_gui {
	static int jc(int n){
		if (n==1)
		{
			return 1;
		}
		else
		{
			return n*jc(n-1);
		}
	}
public static void main(String args []){
	System.out.println(jc(10));
}
}
