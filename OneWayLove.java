import java.util.*;
public class OneWayLove{
	String name;
	int weight;
	int sabing;
	boolean effort;
	public OneWayLove(String name){
		this.name=name;
		this.weight=100;
		this.sabing=100;
		this.effort=false;
	}
	public void askLove(String yourName){
		System.out.printf("%sさん私と付き合ってください%n",yourName);
	}
	public void betterMyself(){
		int num=new Random().nextInt(3)+1;
		switch(num){
		case 1:
			this.toWork();
			break;
		case 2:
			this.marathon();	
			break;
		case 3:
			this.overEat();
			break;
		}
	}
	public void toWork(){
		int income=new Random().nextInt(401)+100;
		this.sabing+=income;
		this.effort=true;
		System.out.printf("%sさんは出稼ぎに出て%d万円稼ぎました%n",this.name,income);
	}
	public void marathon(){
		int weightLost=new Random().nextInt(40)+5;
		if(this.weight-weightLost<55){
			weightLost=this.weight-54;
			this.weight=54;
			
		}else{
 			this.weight-=weightLost;
			this.effort=true;
		}
		System.out.printf("%sさんはマラソン大会に出て%dkg痩せました%n",this.name,weightLost);
		
	}
	public void overEat(){
		this.weight+=10;
		this.sabing-=10;
		this.effort=false;
		System.out.printf("%sさんは暴飲暴食をしました%n",this.name);
	}
	public void myStatus(){
		System.out.printf("%sさんの体重は%dkg,貯金は%d万円です%n",this.name,this.weight,this.sabing);
	}
}
