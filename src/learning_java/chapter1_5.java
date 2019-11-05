package learning_java;

public class chapter1_5 {
static int sumint=0;
/*public static int sum(int n){	
		if (n==1){
			return n;
		}
		else{
			sumint=n+sum(n-1);
		}
		return sumint;
	}*/
public static int sum(int n){	
	if(n>=1){
		sumint=n+sum(n-1);
	}
	return sumint;
}
public static void main(String []args){
	System.out.print(sum(9));
}
}

/*public class Test {
	private int sum=0,num=1;
	public int calSum(int maxnum){
		if(num<=maxnum){
			sum+=num;
			num++;
			calSum(maxnum);
		}
		return sum;
	}
	public static void main(String[] args) {
		Test test=new Test();
		System.out.println("1+2+3+...+100="+test.calSum(100));
	}
}*/