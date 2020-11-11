import java.util.*;
public class Nums{
	public static void main(String[] args){
		int[] nums=new int[5];
		for(int i=0;i<nums.length;i++){
			int rum=new Random().nextInt(100);
			nums[i]=rum;
			System.out.printf("nums[%d]:%d%n",i,nums[i]);
		}
		System.out.println();
	}
}
