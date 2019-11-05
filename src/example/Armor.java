package example;


public class Armor extends Item {
int ac;
public static void main(String [] args){
	Armor a1=new Armor();
	Armor a2=new Armor();
	a1.name="À¼¶Ü";
	a1.price=3500;
	a1.ac=230;
	a2.name="°å¼×";
	a2.price=3200;
	a2.ac=300;
	System.out.println(a1.name);
}
}
