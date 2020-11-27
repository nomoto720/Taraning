import java.util.*;
public class Main2{
	public static void main(String[] args){
		System.out.print("名前を入力してください>");
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		Hero h1=new Hero(name,100);
		System.out.println(h1.name+h1.hp);
		System.out.print("名前を入力してください>");
		name=scan.nextLine();
		Hero h2=new Hero(name,80);
		System.out.println(h2.name+h2.hp);
	}
}
