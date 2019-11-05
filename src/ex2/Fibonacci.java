package ex2;
import java.util.*;;


public class Fibonacci {
public static int Fib(int n){
	if(n == 1||n == 2){
		return 1;
	}else{
		return Fib(n-1) + Fib(n-2);
	}
}
public static void main(String [] args){
	/*int a = 0;
	int b = 1;
	int i = 0;
	int tmp;
	for(i=0;i<10;i++){
		//System.out.println("this is a:" + a);
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("this is a:"+a);
		System.out.println("this is b:"+b);
		//System.out.println("第%d次this is a:" + a);
		System.out.printf("第%d次this is a:%d\n", i,a);
	}*/
	int n,i;
	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	for(i=1;i<=n;i++){
	System.out.println(Fib(i));
	}
}
}
