import java.util.*;
public class Main2{
	public static void main(String[] args){
		System.out.print("名前を入力してください>");
		String name=new Scanner(System.in).nextLine();
		Hero h1=new Hero(name,100);
		System.out.println(h1.name+h1.hp);
		Hero h2=new Hero("ジェシカ",80);
		System.out.println(h2.name+h2.hp);
	}
}
