package array;

import java.util.Scanner;

public class Array_1 {
public static void main(String []args){
	int [][] a;
	a = new int [10][3];
	//Scanner input = new Scanner(System.in);
	for(int i=0;i<3;i++){
	for (int j=0;j<1;j++){
		a[i][j] = new Scanner(System.in).nextInt();
			//a[i][j] = input.nextInt();
		}
	}
	for(int i=0;i<3;i++){
		for (int j=0;j<1;j++){
				System.out.println(a[i][j]);
				//a[i][j] = input.nextInt();
			}
		}
}
}
