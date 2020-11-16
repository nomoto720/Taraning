import java.util.*;
public class FujimuraSan{
	public static void main(String[] args){
		System.out.print("何人>");
		int num=new Scanner(System.in).nextInt();
		String[] names=new String[num];
		int[] nums=new int[num]; 
		for(int i=0;i<num;i++){
		System.out.printf("%d人目の名前>",i+1);
		names[i]=new Scanner(System.in).nextLine();
		nums[i]=new Random().nextInt(99)+1;
		System.out.printf("%sさんの点数:%d%n",names[i],nums[i]);
		}
		for(int i=0;i<num;i++){
			for(int j=i+1;j<num;j++){
				if(nums[i]<nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
					String name=names[i];
					names[i]=names[j];
					names[j]=name;
				}
			}
		}
		for(int i=0;i<num;i++){
			System.out.printf("%dは:%d点:%sさん%n",i+1,nums[i],names[i]);
		}
	}
}
