package genetic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestCollection {
public static void main(String []args){
	List <String> hero = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	String str1 = scan.nextLine();
	hero.add(str1);
	while(!str1.equals("")){
		str1 = scan.nextLine();
		hero.add(str1);
	}
	System.out.println(hero);
	Iterator<String> iter = hero.iterator();
	while(iter.hasNext()){
		String str2 = iter.next();
		System.out.println(str2);
	}
}
}
