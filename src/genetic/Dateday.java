package genetic;
import java.util.Date;
public class Dateday {
public static void main(String []args){
	Date now = new Date();
	System.out.println(now.toString());
	System.out.println(now);
	System.out.println(now.getTime());
	System.out.println(System.currentTimeMillis());
}
}
