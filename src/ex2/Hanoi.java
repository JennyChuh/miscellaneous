package ex2;

public class Hanoi {
static void hanoi(char A,char B,char C,int n){
	if(n==1)
	{
		System.out.println(A+"——>"+C);
	}
	else
	{
		hanoi(A,C,B,n-1);
		System.out.println(A+"——>"+C);
		hanoi(B,A,C,n-1);
	}
}
public static void main(String args[]){
	hanoi('A','B','C',3);
}
}
/*
 * 递归的思想，想办法把递归表达式用数学语言描述出来
 * 然后用编程语言表示数学语言
 * 就比如在汉诺塔问题中，
 * 可以把问题分解成两个步骤，第一个步骤是把A柱子上的最底层的盘子上面的所有n-1个盘子借助一个柱子C移到另一个柱子B
 * 第二步是把B柱子上的n-1个盘子借助A柱子移到C柱子上
 * 然后用编程语言直接描述出来
 * 然后一切OK!
 */
