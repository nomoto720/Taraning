import java.util.*;
public class Arr4{
	public static void main(String[] args){
		int[] nums=new int[10];	
		for(int i=0;i<nums.length;i++){
			nums[i]=new Random().nextInt(nums.length);
			System.out.print(nums[i]+",");
		}
		String[] parity=new String[10];
		for(int i=0;i<nums.length;i++){
			parity[i]=nums[i]%2==0?"偶数":"奇数";
		}
		System.out.println();
		System.out.println(Arrays.toString(parity));
	}
}
