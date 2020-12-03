import java.util.*;
public class Overload{
	public static void main(String[] args){
		int[] arr1=createRandomArr(1,9,3);
		showArr(arr1);
		int[][] arr2=createRandomArr(1,9,3,3);
		for(int[] arr:arr2){
			System.out.println(Arrays.toString(arr));
		}	
		showArr(arr2);
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
	static void showArr(int[][] arr){
		System.out.println("{");
		for(int i=0;i<arr.length;i++){
			showArr(arr[i]);
		}
		System.out.println("}");

	}
}
