import java.util.*;
public class Dice2{
	public static void main(String[] args){
		char[] names={'A','B','C','D'};
		int[] scoreArr=new int[names.length];
		System.out.print("何回ふる>");
		int num=new Scanner(System.in).nextInt();
		for(int i=0;i<names.length;i++){
			int[] nums=dices(num);
			int sum=0;
			sum=diceSum(sum,nums);
			System.out.println(names[i]+"さん:"+Arrays.toString(nums)+"合計:"+sum);
			scoreArr[i]+=sum;	
		}
			for(int i=0;i<scoreArr.length-1;i++){
				for(int j=i+1;j<scoreArr.length;j++){
					if(scoreArr[i]<scoreArr[j]){
						int temp=scoreArr[i];
						scoreArr[i]=scoreArr[j];
						scoreArr[j]=temp;
						char tempNames=names[i];
						names[i]=names[j];
						names[j]=tempNames;
					}
				}
			}
			boolean notDraw=true;
			for(int i=1;i<names.length;i++){
				if(scoreArr[0]!=scoreArr[i]){
					break;
				}else if(i==names.length-1){
					System.out.println("引き分けです");
					notDraw=false;
				}
			}
			if(notDraw){
					System.out.printf("%s",names[0]);
				for(int i=1;i<scoreArr.length;i++){
					if(scoreArr[0]==scoreArr[i]){
						System.out.printf(",%s",names[i]);
					}
				}
					System.out.println(" さんの勝ち");
			}
	}
	static int[] dices(int num){
		int[] dices=new int[num];
		for(int i=0;i<dices.length;i++){
			dices[i]=new Random().nextInt(6)+1;
		}
		return dices;
	}
	static int diceSum(int sum,int[] nums){
		for(int n:nums){
		sum+=n;
		}
		return sum;
	}
}
