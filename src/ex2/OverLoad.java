package ex2;
import java.lang.Math;
public class OverLoad {
 static double Triangle(double x,double y)
 {
	 return (1.0/2)*x*y;
 }
 static double Triangle(double a,double b,double c)
 {
	 double product;
	 double s;
	 s=(a+b+c)/2;
	 product=s*(s-a)*(s-b)*(s-c);
	 return Math.sqrt(product);
 }
 public static void main(String args[])
 {
	 double a,b,c;
	 a=1.0;
	 b=2.0;
	 c=2.5;
	 System.out.println(Triangle(a,b));
	 System.out.println(Triangle(a,b,c));
 }
}
