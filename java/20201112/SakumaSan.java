import java.util.*;
public class SakumaSan{
	public static void main(String[] args){
		System.out.print("要素数を入力>");
		int num=new Scanner(System.in).nextInt();
		int[] nums=new int[num];
		int count1=0;
		int count7=0;
		int count17=0;	
		for(int i=0;i<nums.length;i++){
			int rum=new Random().nextInt(20)+1;
			if(rum==1){
			nums[i]=rum;
			count1=count1+1;
			}else if(rum==7){
			nums[i]=rum;
			count7=count7+1;
			}else if(rum==17){
			nums[i]=rum;
			count17=count17+1;
			}
		}
		System.out.println(Arrays.toString(nums));
		if(count1==0){
			System.out.println("1は出ませんでした");
		}else{
			System.out.printf("1は%d回でました%n",count1);
		}

		if(count7==0){
			System.out.println("7は出ませんでした");
		}else{
			System.out.printf("7は%d回でました%n",count7);
		}
		
		if(count17==0){
			System.out.println("17は出ませんでした");
		}else{
			System.out.printf("17は%d回でました%n",count17);
		}
	}
}
