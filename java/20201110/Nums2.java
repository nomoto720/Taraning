import java.util.*;
public class Nums2{
	public static void main(String[] args){
		int[]nums=new int[5];
		
		for(int i=0;i<7;i++){
			if(i==3){
				System.out.print("nums1");
			}else{	
				System.out.print("*");
			}
		}
		System.out.println();
		for(int i=0;i<nums.length;i++){
			int rum=new Random().nextInt(99)+1;
			nums[i]=rum;
			System.out.println(nums[i]);
		}
		for(int i=0;i<7;i++){
			if(i==3){
				System.out.print("nums2");
			}else{
				System.out.print("*");
			}
		}
		System.out.println();
		for(int i=0;i<nums.length;i++){
			nums[i]=nums[i]*3;
			System.out.println(nums[i]);
		}
		System.out.println();
	}
}
