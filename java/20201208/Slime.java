import java.util.*;
public class Slime{
	String name;
	public Slime(String name){
		this.name=name;
	}
	public void appear(){
		System.out.println(this.name+"が現れた！");
	}
	public void attack(){
		System.out.println(this.name+"の攻撃：5ポイントのダメージを与えた！");
	}
}
