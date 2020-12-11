import java.util.*;
public class Dice{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.print("サイコロを何回ふりますか>");
		int num=sc.nextInt();
		Map<Integer,Integer> dice=new LinkedHashMap<>();
		dice.put(1,0);
		dice.put(2,0);
		dice.put(3,0);
		dice.put(4,0);
		dice.put(5,0);
		dice.put(6,0);
		for(int i=0;i<num;i++){
			int roll=rand.nextInt(6)+1;
			int count=dice.get(roll)+1;
			dice.put(roll,count);	
		}
		for(Integer key:dice.keySet()){
			System.out.println(key+"..."+dice.get(key)+"回");
		}
	}
}
