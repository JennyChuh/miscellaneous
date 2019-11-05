package ex2;
/*
 * 递归函数的构造
 * 1.首先构建递归表达式
 * 2.根据递归表达式构建函数
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
