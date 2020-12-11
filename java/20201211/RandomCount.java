import java.util.*;
public class RandomCount{
	public static void main(String[] args){
		Random rand=new Random();
		System.out.println("1～100の乱数を100回発生させたよ");
		Map<Integer,Integer> randomCount=new TreeMap<>();
		for(int i=1;i<=100;i++){
			int number=rand.nextInt(100)+1;
			if(randomCount.containsKey(number)){
				randomCount.put(number,randomCount.get(number)+1);
			}else{
				randomCount.put(number,1);
			}
		}
		System.out.println("***result***");
		System.out.println(randomCount.size()+"種類の数値が出ました");
		for(Integer key:randomCount.keySet()){
			System.out.println(key+"…"+randomCount.get(key));
		}
	}
}
