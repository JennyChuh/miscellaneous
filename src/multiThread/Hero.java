package multiThread;

public class Hero {
	public String name;
	public float hp;
	public int damage;
	public void attack(Hero h){
		System.out.println(name+"���ڹ���"+h.name);
		synchronized (h){
		h.hp -= damage;
		System.out.println(name+"��"+h.name+"�����"+damage+"���˺�");
		if(h.hp>=0){
		System.out.println(h.name+"��ǰѪ��Ϊ"+h.hp);
		}else{
			System.out.println(h.name+"��ǰѪ��Ϊ"+"0");
		}
		if(h.isDead()){
			System.out.println(h.name+"��������");
			System.exit(0);
		}
		}
	}
	public boolean isDead(){
		return hp<=0?true:false;
	}
}
