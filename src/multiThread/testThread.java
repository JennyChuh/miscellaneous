package multiThread;

public class testThread {
	public static void main(String []args){
	Hero leesin = new Hero();
	leesin.name = "äɮ";
	leesin.hp = 600;
	leesin.damage = 68;
	Hero gareen = new Hero();
	gareen.name = "����";
	gareen.hp = 800;
	gareen.damage = 78;
	Hero SJ = new Hero();
	SJ.name = "�ͽ�����";
	SJ.hp = 500;
	SJ.damage = 80;
	killThread k1 = new killThread(leesin,gareen);
	k1.start();
	killThread k2 = new killThread(SJ,gareen);
	k2.start();
	}
}
