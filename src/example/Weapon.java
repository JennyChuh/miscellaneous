package example;

abstract class Weapon {
	int hit;
	int cost;
	public void cost(){
		System.out.println("Buy the infiniteEdge will cost you"+10*hit+"golden cions!");
	}
	public void attack(){
		System.out.println("对方英雄被攻击了一次，掉了"+hit+"点血!");
	}
}
