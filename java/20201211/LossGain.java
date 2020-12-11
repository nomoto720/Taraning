import java.util.*;
public class LossGain{
	public static void main(String[] args){
		Random rand=new Random();
		Map<Integer,Integer> dices=new LinkedHashMap<>();
		LossGain.dicesCreate(dices);
		Map<Integer,String> compNum=new TreeMap<>();
		for(int i=0;i<10;i++){
			while(true){	
				int count=0;
				count++;
				int dice=rand.nextInt(6)+1;
				LossGain.diceCount(dices,dice);
				if(dices.get(1)>0&&dices.get(2)>0&&dices.get(3)>0&&dices.get(4)>0&&dices.get(5)>0&&dices.get(6)>0){
					if(compNum.containsKey(count)){
						compNum.put(count,compNum.get(count+"*"));
					}else{
						compNum.put(count,"*");
					}
				}
				LossGain.dicesCreate(dices);
			}
		}
		System.out.println("***************************結果*****************************");
		for(Integer key:compNum.keySet()){
			System.out.println(key+"("+key*300+"):"+compNum.get(key));
		}
	}
	public static void dicesCreate(Map dices){
		for(int i=1;i<=6;i++){
			dices.put(i,0);
		}
	}
	public static void diceCount(Map dices,int dice){
		if(dices.containsKey(dice)){
			System.out.print(dices.get(dice));
			dices.put(dice,1);
		}else{
			dices.put(dice,1);	
		}	
	}
}
