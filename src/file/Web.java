package file;
import java.util.Scanner;
public class Web {
public static void main(String []args)throws Exception{
	System.out.println("«Î ‰»ÎURLµÿ÷∑:");
	String URLs = new Scanner(System.in).next();
	java.net.URL  url = new java.net.URL(URLs);
	Scanner input = new Scanner(url.openStream());
	int count = 0;
	while(input.hasNext()){
		String s1 = input.nextLine();
		count += s1.length();
	}
	System.out.printf("the size of given url page is: %d characters",count);   
}
}
