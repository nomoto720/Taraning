public class Main{
	public static void main(String[] args){
		//SuperHero sh=new SuperHero();
		//sh.run();
		//Weapon w=new Weapon();
		Hero h=new Hero();
		Matango[] ms=new PoisonMatango[3];
		ms[0]=new PoisonMatango('A');
		ms[1]=new PoisonMatango('B');
		ms[2]=new PoisonMatango('C');
		
		for(Matango m : ms){
			m.attack(h);
		}
		System.out.println(h.name+"のHP:"+h.hp);
	}
}
