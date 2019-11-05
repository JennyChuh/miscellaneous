package genetic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import charactor.Hero1;

public class TestComtor {
public static void main(String []args){
	Random rand = new Random();
	List <Hero1> heros = new ArrayList<>();
	for(int i=0;i<10;i++){
		heros.add(new Hero1("hero"+i,rand.nextInt(5000),rand.nextInt(100)));
	}
	System.out.print("初始化英雄集合: ");
	System.out.println(heros);
	Comparator <Hero1> comp = new Comparator<Hero1>(){
		@Override
		public int compare (Hero1 h1,Hero1 h2){
			if(h1.hp > h2.hp){
				return 1;
			}else{
				return -1;
			}
		}
	};
	Collections.sort(heros,comp);
	System.out.print("排序后的英雄: ");
	System.out.println(heros);
}
}
