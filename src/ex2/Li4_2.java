package ex2;
//import java.io.*;
/*class variable{
	static int m=4;
	static int n=5;
}
public class Li4_2 {
	public static void main(String args[]){
		System.out.print(variable.m+variable.n);
	}
}*/
class rect{
	float width=5.2F;
	float height=6.3F;
public void setV(float x,float y){
		width=x;
		height=y;
		return ;
	}
	float mul(float x,float y){
		float area;
		area=x*y;
		return area;
	}
}

public class Li4_2{
	public static void main(String args[]){
		rect tag=new rect();
		tag.setV(3.0f,6.0f);
		float fl=tag.mul(tag.width, tag.height);
		System.out.print(fl);
	}
}