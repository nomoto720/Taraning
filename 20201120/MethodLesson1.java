import java.util.*;
public class MethodLesson1{
	static void eat(){
		System.out.println("モグモグ");
		System.out.println("ゴクゴク");
	}
	public static void main(String[] args){
		/*System.out.print("あなたの名前を入れてください>");
		String name=new Scanner(System.in).nextLine();
		hello(name);

		hello("namae");	
		hello("佐藤");
		eat();
		bye();*/
	}
	static void hello(String name)/*←引数*/{
		System.out.println(name+"さん、Hello");
	}
	static void bye(){
		System.out.println("Bye");
	}
}
