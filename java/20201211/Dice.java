import java.util.*;
public class Dice{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.print("サイコロを何回ふりますか>");
		int num=sc.nextInt();
		Map<Integer,Integer> dice=new LinkedHashMap<>();
		for(int i=0;i<num;i++){
			int roll=rand.nextInt(6)+1;
			dice.put(i,roll);
		}
		for(Integer key:dice.keySet()){
			System.out.println(key+"..."+dice.get(key)+"回");
		}
	}
}
