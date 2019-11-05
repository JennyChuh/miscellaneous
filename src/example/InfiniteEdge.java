package example;

import java.util.Scanner;

public class InfiniteEdge extends Weapon implements Gongji {
	public void hit(){
		System.out.println("this is infiniteEdge!");
	}
	public void cost(){
		System.out.println("Buy the infiniteEdge will cost you 3000 golden cions!");
	}
	public static void main(String [] args){
		InfiniteEdge edge = new InfiniteEdge();
		Scanner scan = new Scanner(System.in);
		edge.hit = scan.nextInt();
		edge.hit();
		edge.cost();
		edge.attack();
	}
}
