package ex2;

class SP{
	private int x;
	private int y;
	void Set_x(int a){
		x=a;
	}
	void Set_y(int a){
		y=a;
	}
	int Get_x(){
		return x;
	}
	int Get_y(){
		return y;
	}
}
class Change{
	private int h;
	private int k;
	private int x;
	private int y;
	SP n=new SP();
	void Set_x(int a){
		h=a;
		x=h+n.Get_x();
	}
	void Set_y(int a){
		k=a;
		y=k+n.Get_y();
	}
	int Get_x(){
		return x;
	}
	int Get_y(){
		return y;
	}
}
public class Li5_3 {
	public static void main(String args[]){
		Change m=new Change();
		m.n.Set_x(1);
		m.n.Set_y(2);
		System.out.println("初始坐标是:"+"("+m.n.Get_x()+","+m.n.Get_y()+")");
		m.Set_x(2);
		m.Set_y(2);
		System.out.println("平移之后坐标是:"+"("+m.Get_x()+","+m.Get_y()+")");
	}
}
