package multiThread;

public class Hero {
	public String name;
	public float hp;
	public int damage;
	public void attack(Hero h){
		System.out.println(name+"正在攻击"+h.name);
		synchronized (h){
		h.hp -= damage;
		System.out.println(name+"对"+h.name+"造成了"+damage+"点伤害");
		if(h.hp>=0){
		System.out.println(h.name+"当前血量为"+h.hp);
		}else{
			System.out.println(h.name+"当前血量为"+"0");
		}
		if(h.isDead()){
			System.out.println(h.name+"已阵亡！");
			System.exit(0);
		}
		}
	}
	public boolean isDead(){
		return hp<=0?true:false;
	}
}
