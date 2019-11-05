package array;

import java.util.Scanner;

public class Array {
public static void main(String [] args){
	int [] a;
	a = new int [2];
	Scanner input = new Scanner(System.in);
	for(int i=0;i<a.length;i++){
		
		a[i] = input.nextInt();
	}
	for(int i  : a){
		System.out.println(i);
	}
	coin token = new coin();
	token.print(10);
}
static class coin {
	public  void print(int i){
		System.out.print("this is the " + i +"th class which in class Array");
	}
}
}
