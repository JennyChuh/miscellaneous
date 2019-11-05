package file;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class clender {
public  static void main(String []args){
	Date day = new Date();
	System.out.print(day);
	Calendar c = new GregorianCalendar();
	System.out.print(c.get(Calendar.YEAR)+"	");
	System.out.print("0"+(c.get(Calendar.MONTH)+1)+"	");
	System.out.print(c.get(Calendar.DATE)+"	");
	System.out.print(c.get(Calendar.HOUR)+"	");
	System.out.print(c.get(Calendar.MINUTE)+"	");
	System.out.print(c.get(Calendar.SECOND));
}
}
