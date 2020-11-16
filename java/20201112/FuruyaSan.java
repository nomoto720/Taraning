import java.util.*;
public class FuruyaSan{
	public static void main(String[] args){
		String[] likes=new string[5];
		System.out.println("好きな事を5つ入力してください");
		for(int i=0;i<likes.length;i++){
			System.out.print("１つ目>");
			likes[i]=new Scanner(system.in).nextLine();
		}
		int rum=new Random().nextInt(4)+1;
		for(int i=0;i<rum;i++){
			int num=new Random().nextInt(5);
			System.out.print(likes[num]);
		}
	}
}
