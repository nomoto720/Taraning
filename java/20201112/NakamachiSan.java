import java.util.*;
public class NakamachiSan{
	public static void main(String[] args){
		System.out.print("飛んでから何秒後?>");
		int num=new Scanner(System.in).nextInt();
		int[] nums=new int[num];
		int[] distances=new int[num];
		for(int i=0;i<num;i++){
			nums[i]=9*(i+1);
			distances[i]=((i+1)*(i+1)*9/2;
		}
		System.out.print("飛んでから10秒後までの1秒毎の速度推移は");
		System.out.print(Arrays.toString(nums));
		System.out.println("です。");
 	  System.out.print("飛んでから10秒後までの1秒毎の飛行機からの距離推移は");
		System.out.println(Arrays.toString(distances));

	}
}
