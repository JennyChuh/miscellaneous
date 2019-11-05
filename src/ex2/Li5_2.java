package ex2;

class dot{
	private int x;
	private int y;
	void Set_para(int a,int b){
		x=a;
		y=b;
	}
	int Get_para_x(){
		int a;
		a=x;
		return a;
	}
	int Get_para_y(){
		int a;
		a=y;
		return a;
	}
}
public class Li5_2 {
	public static void main(String args[]){
		final int xM=120;
		final int yM=120;
		dot dot_2=new dot();
		dot_2.Set_para(xM,yM);
		if(dot_2.Get_para_x()>=0&&dot_2.Get_para_x()<=120&&dot_2.Get_para_y()>=0&&dot_2.Get_para_y()<=320){
			dot_2.Set_para(0,0);
			System.out.println("更新坐标值为:"+"("+dot_2.Get_para_x()+","+dot_2.Get_para_y()+")");
		}
		else{
			System.out.println("点(x,y)在[0,0]~[120,320]区域内");
			System.out.println("原坐标值为:"+"("+dot_2.Get_para_x()+","+dot_2.Get_para_y());
		}
	}
	}
