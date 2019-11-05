package multiThread;

public class testThread {
	public static void main(String []args){
	Hero leesin = new Hero();
	leesin.name = "Ã¤É®";
	leesin.hp = 600;
	leesin.damage = 68;
	Hero gareen = new Hero();
	gareen.name = "¸ÇÂ×";
	gareen.hp = 800;
	gareen.damage = 78;
	Hero SJ = new Hero();
	SJ.name = "ÉÍ½ğÁÔÈË";
	SJ.hp = 500;
	SJ.damage = 80;
	killThread k1 = new killThread(leesin,gareen);
	k1.start();
	killThread k2 = new killThread(SJ,gareen);
	k2.start();
	}
}
