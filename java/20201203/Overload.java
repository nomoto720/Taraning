import java.util.*;
public class Overload{
	public static void main(String[] args){
		int[] nums1=createRandomArr(1,9,3);
		showArr(nums1);
		int[][] nums=createRandomArr(1,9,3,2);
		for(int[] arr:nums ){
			System.out.println(Arrays.toString(arr));
		}	
	}
	static int[] createRandomArr(int min,int max,int len){
		Random rand=new Random();
		int[] nums=new int[len];
		for(int i=0;i<nums.length;i++){
			nums[i] =rand.nextInt(max-min+1)+min;
		}
		return nums;
	}
	static int[][] createRandomArr(int min, int max, int len, int childlen){
		int[][] nums=new int[len][childlen];
		for(int i=0;i<nums.length;i++){
			nums[i]=createRandomArr(min,max,childlen);
		}
		return nums;
	}
	static void showArr(int[] arr){
		System.out.print("{");
		for(int n:arr){
			System.out.print(n+",");
		}
		System.out.println("}");
	}
}
