import java.util.*;
public class ArrLesson5{
	public static void main(String[] args){
		System.out.println("--掛け算表--!");
		System.out.print("n(1~9)?>");
		int num=new Scanner(System.in).nextInt();
		int[][] nums=new int[num][9];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				nums[i][j]=(i+1)*(j+1);
			}
		}
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				System.out.printf("%3d|",nums[i][j]);
			}
			System.out.println();
		}
	}
}
