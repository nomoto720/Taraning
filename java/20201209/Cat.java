import java.util.*;
public class Cat{
	String type;
	String name;
	int intimacy;
	public Cat(String name,String type){
		this.name=name;
		this.type=type;
	}
	public void joined(){
		System.out.println(this.name+" joined!");
	}
	public void catStatus(){
		System.out.println(this.name+"["+this.type+"]"+"("+this.intimacy+")");
	}
	public void play(){
		this.intimacy++;
		System.out.println("Playing with "+this.name);
		System.out.println("...");
		System.out.println("Intimacy is ap!!");
	}
}
