package ex2;

class Car{
	double gas;
	String Brand;
	void SetBrand(String sBrand){
		Brand=sBrand;
	}
	void showB(){
		System.out.println(Brand);
	}
}
class  Bus extends Car{
	double gas;
	void SetBrand(String sBrand){
		Brand=sBrand;
	}
}
public class Li6_1 {

public static void main(String args[]){
	Bus bus = new Bus();
	bus.Brand = "BMW";
	System.out.println(bus.Brand);
}
}
